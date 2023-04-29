package dev.leah.hacks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {
  @Autowired
  private ReviewRepository reviewRepository;
  
  @Autowired
  private MongoTemplate mongoTemplate;
  
  public Review createReview(String body, String hackId) {
    // add to database
    Review review = reviewRepository.insert(new Review(body));
    // associate to the hack
    // create a template to perform update to the hack class
    mongoTemplate.update(Hack.class)
            .matching(Criteria.where("hackId").is(hackId))
            .apply(new Update().push("reviewIds").value(review))
            .first();
    return review;
  }
}
