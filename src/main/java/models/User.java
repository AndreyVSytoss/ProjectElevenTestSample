package models;

/**
 * Created by averpeta on 3/22/2017.
 */
public class User {
    private String login;
    private Integer id;
    private String avatar_url;
    private String gravatar_id;
    private String url;
    private String html_url;
    private String followers_url;
    private String following_url;
    private String gists_url;
    private String starred_url;
    private String subscriptions_url;
    private String organizations_url;
    private String  repos_url;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (login != null ? !login.equals(user.login) : user.login != null) return false;
        if (id != null ? !id.equals(user.id) : user.id != null) return false;
        if (avatar_url != null ? !avatar_url.equals(user.avatar_url) : user.avatar_url != null) return false;
        if (gravatar_id != null ? !gravatar_id.equals(user.gravatar_id) : user.gravatar_id != null) return false;
        if (url != null ? !url.equals(user.url) : user.url != null) return false;
        if (html_url != null ? !html_url.equals(user.html_url) : user.html_url != null) return false;
        if (followers_url != null ? !followers_url.equals(user.followers_url) : user.followers_url != null)
            return false;
        if (following_url != null ? !following_url.equals(user.following_url) : user.following_url != null)
            return false;
        if (gists_url != null ? !gists_url.equals(user.gists_url) : user.gists_url != null) return false;
        if (starred_url != null ? !starred_url.equals(user.starred_url) : user.starred_url != null) return false;
        if (subscriptions_url != null ? !subscriptions_url.equals(user.subscriptions_url) : user.subscriptions_url != null)
            return false;
        if (organizations_url != null ? !organizations_url.equals(user.organizations_url) : user.organizations_url != null)
            return false;
        if (repos_url != null ? !repos_url.equals(user.repos_url) : user.repos_url != null) return false;
        if (events_url != null ? !events_url.equals(user.events_url) : user.events_url != null) return false;
        if (received_events_url != null ? !received_events_url.equals(user.received_events_url) : user.received_events_url != null)
            return false;
        if (type != null ? !type.equals(user.type) : user.type != null) return false;
        if (site_admin != null ? !site_admin.equals(user.site_admin) : user.site_admin != null) return false;
        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        if (company != null ? !company.equals(user.company) : user.company != null) return false;
        if (blog != null ? !blog.equals(user.blog) : user.blog != null) return false;
        if (location != null ? !location.equals(user.location) : user.location != null) return false;
        if (email != null ? !email.equals(user.email) : user.email != null) return false;
        if (hireable != null ? !hireable.equals(user.hireable) : user.hireable != null) return false;
        if (bio != null ? !bio.equals(user.bio) : user.bio != null) return false;
        if (public_repos != null ? !public_repos.equals(user.public_repos) : user.public_repos != null) return false;
        if (public_gists != null ? !public_gists.equals(user.public_gists) : user.public_gists != null) return false;
        if (followers != null ? !followers.equals(user.followers) : user.followers != null) return false;
        if (following != null ? !following.equals(user.following) : user.following != null) return false;
        if (created_at != null ? !created_at.equals(user.created_at) : user.created_at != null) return false;
        return updated_at != null ? updated_at.equals(user.updated_at) : user.updated_at == null;
    }

    @Override
    public int hashCode() {
        int result = login != null ? login.hashCode() : 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (avatar_url != null ? avatar_url.hashCode() : 0);
        result = 31 * result + (gravatar_id != null ? gravatar_id.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (html_url != null ? html_url.hashCode() : 0);
        result = 31 * result + (followers_url != null ? followers_url.hashCode() : 0);
        result = 31 * result + (following_url != null ? following_url.hashCode() : 0);
        result = 31 * result + (gists_url != null ? gists_url.hashCode() : 0);
        result = 31 * result + (starred_url != null ? starred_url.hashCode() : 0);
        result = 31 * result + (subscriptions_url != null ? subscriptions_url.hashCode() : 0);
        result = 31 * result + (organizations_url != null ? organizations_url.hashCode() : 0);
        result = 31 * result + (repos_url != null ? repos_url.hashCode() : 0);
        result = 31 * result + (events_url != null ? events_url.hashCode() : 0);
        result = 31 * result + (received_events_url != null ? received_events_url.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (site_admin != null ? site_admin.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (company != null ? company.hashCode() : 0);
        result = 31 * result + (blog != null ? blog.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (hireable != null ? hireable.hashCode() : 0);
        result = 31 * result + (bio != null ? bio.hashCode() : 0);
        result = 31 * result + (public_repos != null ? public_repos.hashCode() : 0);
        result = 31 * result + (public_gists != null ? public_gists.hashCode() : 0);
        result = 31 * result + (followers != null ? followers.hashCode() : 0);
        result = 31 * result + (following != null ? following.hashCode() : 0);
        result = 31 * result + (created_at != null ? created_at.hashCode() : 0);
        result = 31 * result + (updated_at != null ? updated_at.hashCode() : 0);
        return result;
    }

    private String events_url;
    private String received_events_url;
    private String type;
    private Boolean site_admin;
    private String name;
    private String company;
    private String blog;
    private String location;
    private String  email;
    private String hireable;
    private String bio;
    private String public_repos;
    private String  public_gists;
    private String followers;
    private String following;
    private String created_at;

    public String getOrganizations_url() {
        return organizations_url;
    }

    public void setOrganizations_url(String organizations_url) {
        this.organizations_url = organizations_url;
    }

    public String getRepos_url() {
        return repos_url;
    }

    public void setRepos_url(String repos_url) {
        this.repos_url = repos_url;
    }

    public String getEvents_url() {
        return events_url;
    }

    public void setEvents_url(String events_url) {
        this.events_url = events_url;
    }

    public String getReceived_events_url() {
        return received_events_url;
    }

    public void setReceived_events_url(String received_events_url) {
        this.received_events_url = received_events_url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getSite_admin() {
        return site_admin;
    }

    public void setSite_admin(Boolean site_admin) {
        this.site_admin = site_admin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getBlog() {
        return blog;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHireable() {
        return hireable;
    }

    public void setHireable(String hireable) {
        this.hireable = hireable;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getPublic_repos() {
        return public_repos;
    }

    public void setPublic_repos(String public_repos) {
        this.public_repos = public_repos;
    }

    public String getPublic_gists() {
        return public_gists;
    }

    public void setPublic_gists(String public_gists) {
        this.public_gists = public_gists;
    }

    public String getFollowers() {
        return followers;
    }

    public void setFollowers(String followers) {
        this.followers = followers;
    }

    public String getFollowing() {
        return following;
    }

    public void setFollowing(String following) {
        this.following = following;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    private String updated_at;


    public User() {
    }

    public User(String login, Integer id, String avatar_url, String gravatar_id, String url, String html_url, String followers_url, String following_url, String gists_url, String starred_url, String subscriptions_url) {
        this.login = login;
        this.id = id;
        this.avatar_url = avatar_url;
        this.gravatar_id = gravatar_id;
        this.url = url;
        this.html_url = html_url;
        this.followers_url = followers_url;
        this.following_url = following_url;
        this.gists_url = gists_url;
        this.starred_url = starred_url;
        this.subscriptions_url = subscriptions_url;
    }

    public String getLogin() {
        return login;
    }

    public Integer getId() {
        return id;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public String getGravatar_id() {
        return gravatar_id;
    }

    public String getUrl() {
        return url;
    }

    public String getHtml_url() {
        return html_url;
    }

    public String getFollowers_url() {
        return followers_url;
    }

    public String getFollowing_url() {
        return following_url;
    }

    public String getGists_url() {
        return gists_url;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", id=" + id +
                ", avatar_url='" + avatar_url + '\'' +
                ", gravatar_id='" + gravatar_id + '\'' +
                ", url='" + url + '\'' +
                ", html_url='" + html_url + '\'' +
                ", followers_url='" + followers_url + '\'' +
                ", following_url='" + following_url + '\'' +
                ", gists_url='" + gists_url + '\'' +
                ", starred_url='" + starred_url + '\'' +
                ", subscriptions_url='" + subscriptions_url + '\'' +
                ", organizations_url='" + organizations_url + '\'' +
                ", repos_url='" + repos_url + '\'' +
                ", events_url='" + events_url + '\'' +
                ", received_events_url='" + received_events_url + '\'' +
                ", type='" + type + '\'' +
                ", site_admin=" + site_admin +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", blog='" + blog + '\'' +
                ", location='" + location + '\'' +
                ", email='" + email + '\'' +
                ", hireable='" + hireable + '\'' +
                ", bio='" + bio + '\'' +
                ", public_repos='" + public_repos + '\'' +
                ", public_gists='" + public_gists + '\'' +
                ", followers='" + followers + '\'' +
                ", following='" + following + '\'' +
                ", created_at='" + created_at + '\'' +
                ", updated_at='" + updated_at + '\'' +
                '}';
    }

    public String getStarred_url() {
        return starred_url;
    }

    public String getSubscriptions_url() {
        return subscriptions_url;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public void setGravatar_id(String gravatar_id) {
        this.gravatar_id = gravatar_id;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }

    public void setFollowers_url(String followers_url) {
        this.followers_url = followers_url;
    }

    public void setFollowing_url(String following_url) {
        this.following_url = following_url;
    }

    public void setGists_url(String gists_url) {
        this.gists_url = gists_url;
    }

    public void setStarred_url(String starred_url) {
        this.starred_url = starred_url;
    }

    public void setSubscriptions_url(String subscriptions_url) {
        this.subscriptions_url = subscriptions_url;
    }

}


