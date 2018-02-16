package org.wecancodeit.reviews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {

	Map<Long, Review> reviews = new HashMap<>();

	public ReviewRepository() {
		Review barreThree = new Review(1L, "Barre3", "./barre3.png", "https://barre3.com/", "Low-Impact workout",
				"Barre3 incorporates cardio and weights throughout the workout to give you a total body workout. \n Not only that, but it targets muscles you never knew you had.  Unlike a lot of workouts, barre3 has modifications for every move, so if you have a bad knee or back there will be a modification to alleviate the pain and make each posture work for you. I've never been in better shape, and a lot of that has to do with barre3.");
		Review butcherShop = new Review(2L, "The ButcherShop Fitness", "./lagree.jpg", "https://www.butchershopfitness.com/", "Low-Impact workout",
				"Similar to barre, this workout targets muscles you've never worked before. And a big reason for that is due to the machine's design. Each workout is 50 minutes (or 40 if you are doing the ab class), and consists of slow, controlled movements. For instance, you'll be in a pike to plank, and instead of trying to do as many as you can, the goal is to go as slow as you can. This is A LOT harder. This workout is so hard that you will need to take a break, and I don't mean the classic break during a workout where it's mostly in your head. I mean these moves are so challenging and target muscles you rarely use that you will need to take breaks. However, as I've continued to go, I've noticed I'm getting stronger, and am taking fewer breaks.");
		Review sos = new Review(3L, "System of Strength", "sos.jpg", "https://systemofstrength.com/", "High-Impact workout",
				"What I like about system is the variety of classes you can take. They have classes that span from hot yoga, to weight training, to bootcamp/obstacle courses. There is something for everyone. The workouts I've done incorporated weight training and cardio, which you don't realize you don't need to run or bike a mile to get great cardio. After each workout, I felt stronger, sweatier, and ready to tackle my daily to-do list.");

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
