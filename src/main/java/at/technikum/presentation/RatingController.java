package at.technikum.presentation;

import at.technikum.business.model.MediaEntry;
import at.technikum.business.model.Rating;
import at.technikum.business.service.RatingService;

import java.util.List;

public class RatingController {
    private final RatingService ratingService;

    public RatingController(RatingService ratingService) {
        this.ratingService = ratingService;
    }

    public void addRating(Rating rating) {
        ratingService.addRating(rating);
    }

    public List<Rating> getAllRatings() {
        return ratingService.getAllRatings();
    }

    public List<Rating> getRatingsByMedia(MediaEntry mediaEntry) {
        return ratingService.getRatingsByMedia(mediaEntry);
    }
}
