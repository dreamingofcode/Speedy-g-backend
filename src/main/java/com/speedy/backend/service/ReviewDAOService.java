package com.speedy.backend.service;

import com.speedy.backend.models.Review;
import com.speedy.backend.repositories.ReviewRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//@Component
public class ReviewDAOService {
    private static ReviewRepository reviewRepository;
    private static List<Review> reviews= new ArrayList<>();
//    private static List<Review> reviews= reviewRepository;

    ///how can I import the data from table here to iterate and find individual ID?

    //GET Method for individual review
    public static Review findReview(int id){
        for(Review review:reviews){
            if(review.getId()==id){
                return review;
            }
        }
        return null;
    }

    ///POST method for creating new Review
    public static Review save(Review review) {

        reviews.add(review);
        return review;
    }

    //Delete method
    public static int deleteUserById(int id) {
        Review userMaybe= findReview( id);
        if (userMaybe==null){
            return 0;}

        reviews.remove(userMaybe);
        return 1;
    }


}
