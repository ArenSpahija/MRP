package at.technikum.business.model;

import java.util.Set;

public class Movie extends MediaEntry{
    private int lengthInMinutes;

    public Movie(String title,
                 String description,
                 int releaseYear,
                 Set<Genre> genres,
                 int ageRestriction,
                 User creator,
                 int lengthInMinutes) {

        super(title, description, releaseYear, genres, ageRestriction, creator);
        this.lengthInMinutes = lengthInMinutes;
    }

    public int getLengthInMinutes() {
        return lengthInMinutes;
    }

    public void setLengthInMinutes(int lengthInMinutes) {
        this.lengthInMinutes = lengthInMinutes;
    }
}
