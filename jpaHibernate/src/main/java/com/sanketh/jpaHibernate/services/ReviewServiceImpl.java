package com.sanketh.jpaHibernate.services;

import com.sanketh.jpaHibernate.models.Review;
import com.sanketh.jpaHibernate.repositories.ReviewRepository;
import org.springframework.stereotype.Service;

@Service
public class ReviewServiceImpl implements ReviewService{

    private ReviewRepository reviewRepository;

    public ReviewServiceImpl(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @Override
    public Review publishReview(Review review) {
       return this.reviewRepository.save(review);
    }
}
