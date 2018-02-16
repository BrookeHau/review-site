package org.wecancodeit.reviews;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;

public class ReviewRepositoryTest {

	private long firstReviewId = 23L;
	private Review firstReview = new Review(firstReviewId, "Title", "Category", "Content");

	private long secondReviewId = 24L;
	private Review secondReview = new Review(secondReviewId, "Title2", "Category2", "Content2");

	@Test
	public void shouldFindFirstReview() {
		ReviewRepository rRepository = new ReviewRepository(firstReview);
		Review result = rRepository.findOne(firstReviewId);
		assertThat(result, is(firstReview));
	}

	@Test
	public void shouldFindSecondReview() {
		ReviewRepository rRepository = new ReviewRepository(firstReview, secondReview);
		Review result = rRepository.findOne(secondReviewId);
		assertThat(result, is(secondReview));
	}

	@Test
	public void findAll() {
		ReviewRepository rRepository = new ReviewRepository(firstReview, secondReview);
		Collection<Review> result = rRepository.findAll();
		assertThat(result, containsInAnyOrder(firstReview, secondReview));

	}
}
