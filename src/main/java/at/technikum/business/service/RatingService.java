package at.technikum.business.service;

import at.technikum.business.model.MediaEntry;
import at.technikum.business.model.Rating;

import java.util.List;

public interface RatingService {
    void addRating(Rating rating);

    List<Rating> getAllRatings();

    List<Rating> getRatingsByMedia(MediaEntry mediaEntry);
}
