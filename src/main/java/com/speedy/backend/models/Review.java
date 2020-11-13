package com.speedy.backend.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity//// This tells Hibernate to make a table out of this class
public class Review {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private Integer index;
    private String comment;
    private String client;
    private String date;
    private Integer rating;
    private String location;

    ///WHY DO WE NOT USE CONSTRUCTORS >?  is the resource/controller handling this for us?
//    public Review() {
//        this.id = id;
//        this.index = index;
//        this.comment = comment;
//        this.client = client;
//        this.date = date;
//        this.rating = rating;
//        this.location = location;
//    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }


    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }


    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }


    public  String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

//    @Override
//    public String toString() {
//        return "Review{" +
//                "id=" + id +
//                ", index=" + index +
//                ", comment='" + comment + '\'' +
//                ", client='" + client + '\'' +
//                ", date=" + date +
//                ", rating=" + rating +
//                ", location='" + location + '\'' +
//                '}';
//    }
}
