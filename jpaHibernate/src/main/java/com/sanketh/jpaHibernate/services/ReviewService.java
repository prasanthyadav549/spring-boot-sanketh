package com.sanketh.jpaHibernate.services;

import com.sanketh.jpaHibernate.models.Review;
import org.springframework.stereotype.Service;

@Service
public interface ReviewService {

    public Review publishReview(Review review);
}
