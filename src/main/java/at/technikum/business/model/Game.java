package at.technikum.business.model;

import java.util.Set;

public class Game extends MediaEntry {

    private int playTimeInHours;

    public Game(String title,
                String description,
                int releaseYear,
                Set<Genre> genres,
                int ageRestriction,
                User creator,
                int playTimeInHours) {

        super(title, description, releaseYear, genres, ageRestriction, creator);
        this.playTimeInHours = playTimeInHours;
    }

    public int getPlayTimeInHours() {
        return playTimeInHours;
    }

    public void setPlayTimeInHours(int playTimeInHours) {
        this.playTimeInHours = playTimeInHours;
    }
}
