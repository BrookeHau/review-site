package org.wecancodeit.reviews;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReviewController {

	@Resource
	ReviewRepository reviewRepo;

	@RequestMapping("/reviews")
	public String getallReviews(Model model) {
		model.addAttribute("reviews", reviewRepo.findAll());
		return "reviews";
	}
	
	@RequestMapping("review")
	public String getACourse(@RequestParam Long ReviewId, Model model) {
		model.addAttribute("reviews", reviewRepo.findOne(ReviewId));
		return "review";
	}
}
