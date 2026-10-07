package at.technikum.business.model;

import java.util.Set;

public abstract class  MediaEntry extends BaseEntity {
    private String title;
    private String description;
    private int releaseYear;
    private int ageRestriction;
    private User creator;
    private Set<Genre> genres;

    public MediaEntry(String title, String description, int releaseYear, Set<Genre> genres, int ageRestriction, User creator) {

        super();
        this.title = title;
        this.description = description;
        this.releaseYear = releaseYear;
        this.genres = genres;
        this.ageRestriction = ageRestriction;
        this.creator = creator;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getAgeRestriction() {
        return ageRestriction;
    }

    public User getCreator() {
        return creator;
    }

    public Set<Genre> getGenres() {
        return genres;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setAgeRestriction(int ageRestriction) {
        this.ageRestriction = ageRestriction;
    }
}
