package org.wecancodeit.reviews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {

	Map<Long, Review> reviews = new HashMap<>();

	public ReviewRepository() {
		Review barreThree = new Review(1L, "Barre3", "Fitness", "10/10, Amazing");
		Review butcherShop = new Review(2L, "The ButcherShop Fitness", "Fitness", "10/10, challenging");
		Review sos = new Review(3L, "System of Strength", "Fitness", "10/10");

		reviews.put(barreThree.getReviewId(), barreThree);
		reviews.put(butcherShop.getReviewId(), butcherShop);
		reviews.put(sos.getReviewId(), sos);
	}

	public ReviewRepository(Review... firstReview) {
		populateReviewsMap(firstReview);
	}

	private void populateReviewsMap(Review... reviews) {
		for (Review review : reviews) {
			this.reviews.put(review.getReviewId(), review);
		}
	}

	public Review findOne(long reviewId) {
		return reviews.get(reviewId);
	}

	public Collection<Review> findAll() {
		return reviews.values();
	}

}
