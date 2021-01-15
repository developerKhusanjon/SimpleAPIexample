package com.example.my_spring_app.post;

import com.example.my_spring_app.user.User;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Post {

    @Id
    private String id;
    private String postdate;
    @ManyToOne
    private User user;
    private String details;

    public Post(String id, String postdate, User user, String details) {
        this.id = id;
        this.postdate = postdate;
        this.user = user;
        this.details = details;
    }

    public Post() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPostdate() {
        return postdate;
    }

    public void setPostdate(String postdate) {
        this.postdate = postdate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
