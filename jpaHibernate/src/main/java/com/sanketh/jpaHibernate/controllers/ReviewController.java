package com.sanketh.jpaHibernate.controllers;

import com.sanketh.jpaHibernate.DTO.ReviewDto;
import com.sanketh.jpaHibernate.models.Review;
import com.sanketh.jpaHibernate.services.ReviewService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/reviews")
public class ReviewController {
    private ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    //@PostMapping
//    public ResponseEntity<?> publishReview(@RequestBody ReviewDto reviewDto) {
//        Review review = new Review();
//        review.setName(reviewDto.getName());
//        review = reviewService.publishReview(review);
//        return new ResponseEntity<>(review, HttpStatus.CREATED);
//    }
}
