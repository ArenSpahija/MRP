package at.technikum.data.persistence;

import at.technikum.business.model.Rating;

import java.util.List;
import java.util.UUID;

public interface RatingRepository {
    void add(Rating rating);

    List<Rating> getAll();

    Rating getById(UUID id);
}
