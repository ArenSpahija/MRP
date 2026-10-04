package at.technikum.business.model;

import java.time.LocalDateTime;
import at.technikum.business.exception.RatingException;

public class Rating extends BaseEntity{
    private User user;
    private MediaEntry mediaEntry;
    private int stars;
    private String comment;
    private LocalDateTime timestamp;

    public Rating(User user,
                  MediaEntry mediaEntry,
                  int stars,
                  String comment) {

        super();

        if (stars < 1 || stars > 5) {
            throw new RatingException("Rating must be between 1 and 5 stars.");
        }

        this.user = user;
        this.mediaEntry = mediaEntry;
        this.stars = stars;
        this.comment = comment;
        this.timestamp = LocalDateTime.now();
    }

    public User getUser() {
        return user;
    }

    public MediaEntry getMediaEntry() {
        return mediaEntry;
    }

    public int getStars() {
        return stars;
    }

    public String getComment() {
        return comment;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setStars(int stars) {
        if (stars < 1 || stars > 5) {
            throw new RatingException("Rating must be between 1 and 5 stars.");
        }

        this.stars = stars;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
