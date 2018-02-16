package org.wecancodeit.reviews;

public class Review {

	private long reviewId;
	private String title;
	private String category;
	private String content;

	public Review(long reviewId, String title, String category, String content) {
		this.reviewId = reviewId;
		this.title = title;
		this.category = category;
		this.content = content;

	}

	public String getReviewTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}

	public String getDescription() {
		return content;
	}

	public long getReviewId() {
		return reviewId;
	}

}