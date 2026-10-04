package at.technikum.business.model;

import java.util.Set;

public class Series extends MediaEntry {
    private int numberOfSeasons;

    public Series(String title,
                  String description,
                  int releaseYear,
                  Set<Genre> genres,
                  int ageRestriction,
                  User creator,
                  int numberOfSeasons) {

        super(title, description, releaseYear, genres, ageRestriction, creator);
        this.numberOfSeasons = numberOfSeasons;
    }

    public int getNumberOfSeasons() {
        return numberOfSeasons;
    }

    public void setNumberOfSeasons(int numberOfSeasons) {
        this.numberOfSeasons = numberOfSeasons;
    }
}
