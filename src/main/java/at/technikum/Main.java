package at.technikum;


import at.technikum.business.model.*;
import at.technikum.business.service.MediaService;
import at.technikum.business.service.MediaServiceImpl;
import at.technikum.business.service.RatingService;
import at.technikum.business.service.RatingServiceImpl;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // User erstellen
        User user = new User("aren", "1234");


        // Movie erstellen
        Movie movie = new Movie(
                "Inception",
                "A science fiction movie",
                2010,
                Set.of(Genre.ACTION, Genre.DRAMA),
                12,
                user,
                148
        );


        // Series erstellen
        Series series = new Series(
                "Breaking Bad",
                "A crime drama series",
                2008,
                Set.of(Genre.DRAMA),
                16,
                user,
                5
        );


        // Game erstellen
        Game game = new Game(
                "Minecraft",
                "A sandbox game",
                2011,
                Set.of(Genre.FANTASY),
                7,
                user,
                100
        );


        // Movie ausgeben
        System.out.println("Title: " + movie.getTitle());
        System.out.println("Genres: " + movie.getGenres());
        System.out.println("Length: " + movie.getLengthInMinutes() + " minutes");
        System.out.println("Creator: " + movie.getCreator().getUsername());
        System.out.println("ID: " + movie.getId());


        // Series ausgeben
        System.out.println("\n--- Series ---");
        System.out.println("Title: " + series.getTitle());
        System.out.println("Release year: " + series.getReleaseYear());
        System.out.println("Genres: " + series.getGenres());
        System.out.println("Seasons: " + series.getNumberOfSeasons());
        System.out.println("Creator: " + series.getCreator().getUsername());
        System.out.println("ID: " + series.getId());


        // Game ausgeben
        System.out.println("\n--- Game ---");
        System.out.println("Title: " + game.getTitle());
        System.out.println("Release year: " + game.getReleaseYear());
        System.out.println("Genres: " + game.getGenres());
        System.out.println("Play time: " + game.getPlayTimeInHours() + " hours");
        System.out.println("Creator: " + game.getCreator().getUsername());
        System.out.println("ID: " + game.getId());

        Rating rating1 = new Rating(
                user,
                movie,
                5,
                "Very good movie"
        );
        System.out.println("\n--- Rating ---");
        System.out.println("User: " + rating1.getUser().getUsername());
        System.out.println("Media: " + rating1.getMediaEntry().getTitle());
        System.out.println("Stars: " + rating1.getStars());
        System.out.println("Comment: " + rating1.getComment());
        System.out.println("Timestamp: " + rating1.getTimestamp());

        MediaService mediaService = new MediaServiceImpl();

        mediaService.addMedia(movie);
        mediaService.addMedia(series);
        mediaService.addMedia(game);
        System.out.println("\n--- All Media ---");

        for (MediaEntry media : mediaService.getAllMedia()) {
            System.out.println(media.getTitle());
        }

        MediaEntry foundMedia = mediaService.getMediaById(movie.getId());

        System.out.println("\n--- Find Media ---");
        System.out.println("Found: " + foundMedia.getTitle());


        RatingService ratingService = new RatingServiceImpl();



        Rating rating2 = new Rating(
                user,
                movie,
                4,
                "Great movie"
        );

        ratingService.addRating(rating1);
        ratingService.addRating(rating2);

        System.out.println("--- Ratings ---");

        for (Rating rating : ratingService.getRatingsByMedia(movie)) {
            System.out.println(
                    rating.getStars() + " stars - " + rating.getComment()
            );
        }


    }
}