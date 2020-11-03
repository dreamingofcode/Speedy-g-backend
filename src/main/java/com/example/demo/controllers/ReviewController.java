package com.example.demo.controllers;

import com.example.demo.models.Review;
import com.example.demo.repositories.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller // This means that this class is a Controller
@RequestMapping(path="/review") // This means URL's start with /demo (after
public class ReviewController {

    @Autowired
    private ReviewRepository reviewRepository;

    @PostMapping(path="/add") // Map ONLY POST Requests
    public @ResponseBody String addNewReview (@RequestParam String name
            , @RequestParam String email) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

       Review n = new Review();
        n.setName(name);
        n.setEmail(email);
        reviewRepository.save(n);
        return "Saved";
    }




    @GetMapping(path="/all")
    public @ResponseBody
    Iterable<Review> getAllUsers() {
        // This returns a JSON or XML with the users
        return reviewRepository.findAll();
    }
}


//http://localhost:8080/review/all