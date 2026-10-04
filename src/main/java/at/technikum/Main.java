package at.technikum;


import at.technikum.business.model.Genre;
import at.technikum.business.model.Movie;
import at.technikum.business.model.User;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        User user = new User("aren", "1234");

        Movie movie = new Movie(
                "Inception",
                "A science fiction movie",
                2010,
                Set.of(Genre.ACTION, Genre.DRAMA),
                12,
                user,
                148
        );

        System.out.println("Title: " + movie.getTitle());
        System.out.println("Release year: " + movie.getReleaseYear());
        System.out.println("Genres: " + movie.getGenres());
        System.out.println("Length: " + movie.getLengthInMinutes() + " minutes");
        System.out.println("Creator: " + movie.getCreator().getUsername());
        System.out.println("ID: " + movie.getId());
    }
}