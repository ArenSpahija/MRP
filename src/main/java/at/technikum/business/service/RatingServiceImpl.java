package at.technikum.business.service;

import at.technikum.business.model.MediaEntry;
import at.technikum.business.model.Rating;

import java.util.ArrayList;
import java.util.List;

public class RatingServiceImpl implements RatingService {
    private final List<Rating> ratings;

    public RatingServiceImpl() {
        this.ratings = new ArrayList<>();
    }

    @Override
    public void addRating(Rating rating) {
        ratings.add(rating);
    }

    @Override
    public List<Rating> getAllRatings() {
        return ratings;
    }

    @Override
    public List<Rating> getRatingsByMedia(MediaEntry mediaEntry) {
        return ratings.stream()
                .filter(rating -> rating.getMediaEntry().equals(mediaEntry))
                .toList();
    }
}
