package org.wecancodeit.reviews;

public class Review {

	private long reviewId;
	private String title;
	private String category;
	private String content;
	private String image;
	private String url;
	private String miniDescript;

	public Review(long reviewId, String title, String miniDescript, String image, String url, String category, String content) {
		this.image = image;
		this.url = url;
		this.miniDescript = miniDescript;
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

	public String getImage() {
		return image;
	}

	public String getUrl() {
		return url;
	}
	
	public String getMiniDescript() {
		return miniDescript;
	}

}
