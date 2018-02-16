package org.wecancodeit.reviews;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ReviewTest {

	private Review review = new Review(23L, "Title", "Category", "Content");

	@Test
	public void getReviewId() {
		Long check = review.getReviewId();
		assertThat(check, is(23L));
	}

	@Test
	public void getReviewTitle() {
		String check = review.getReviewTitle();
		assertThat(check, is("Title"));
	}

	@Test
	public void getReviewCategory() {
		String check = review.getCategory();
		assertThat(check, is("Category"));
	}

	@Test
	public void getReviewDescription() {
		String check = review.getDescription();
		assertThat(check, is("Content"));
	}
}
