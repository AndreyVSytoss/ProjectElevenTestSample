import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fge.jsonschema.SchemaVersion;
import com.github.fge.jsonschema.cfg.ValidationConfiguration;
import com.github.fge.jsonschema.main.JsonSchemaFactory;
import com.jayway.restassured.RestAssured;
import models.User;
import org.junit.Before;
import org.junit.Test;
import java.io.File;
import java.io.IOException;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;
import static com.jayway.restassured.RestAssured.given;
import static java.net.HttpURLConnection.HTTP_OK;
import static io.restassured.module.jsv.JsonSchemaValidator.*;

public class SampleTestCase {
    @Before

    public void setUp() {
        RestAssured.baseURI = "https://api.github.com";
    }

    @Test
    public void getStatusCode() {

        given()
                .when()
                .get("/users/AndreyVSytoss")
                .then()
                .assertThat().statusCode(HTTP_OK);
    }

    @Test
    public void checkId() {
        given()
                .when()
                .get("/users/AndreyVSytoss")
                .then()
                .body("id", equalTo(13361572));
    }

    @Test
    public void checkResponseBody() throws IOException {

        User response = given().get("/users/AndreyVSytoss").as(User.class);
        User expectedUser = new ObjectMapper().readValue(new File(System.getProperty("user.dir") + File.separator + "user.json"), User.class);
        assertEquals(expectedUser,response);
    }

    @Test
    public void userSchemaValidation() throws IOException {
        JsonSchemaFactory jsonSchemaFactory = JsonSchemaFactory.newBuilder().setValidationConfiguration(ValidationConfiguration.newBuilder().setDefaultVersion(SchemaVersion.DRAFTV4).freeze()).freeze();

        given()
                .get("/users/AndreyVSytoss")
                .then()
                .assertThat()
                .body(matchesJsonSchema(new File (System.getProperty("user.dir") + File.separator + "user-schema.json"))
                        .using(jsonSchemaFactory));
    }

    @Test
    public void checkFollowers() throws IOException {
        given()
                .get("/users/AndreyVSytoss")
                .then()
                .assertThat()
                .body("followers", equalTo(1));
    }
}