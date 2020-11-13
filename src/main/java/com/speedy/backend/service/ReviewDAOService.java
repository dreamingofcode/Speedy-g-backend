package com.speedy.backend.service;

import com.speedy.backend.models.Review;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//@Component
public class ReviewDAOService {

    private static List<Review> reviews= new ArrayList<>();
    ///how can I import the data from table here to iterate and find individual ID?

    public static Review findReview(int id){
        for(Review review:reviews){
            if(review.getId()==id){
                return review;
            }
        }
        return null;
    }


    public static Review save(Review review) {

        reviews.add(review);
        return review;
    }
}
