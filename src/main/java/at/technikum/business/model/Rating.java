package at.technikum.business.model;

import java.time.LocalDateTime;

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
        this.stars = stars;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
