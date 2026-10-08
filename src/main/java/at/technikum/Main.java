package at.technikum;


import at.technikum.business.model.*;
import at.technikum.business.service.*;
import at.technikum.presentation.MediaController;
import at.technikum.presentation.RatingController;
import at.technikum.presentation.UserController;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Services
        MediaService mediaService = new MediaServiceImpl();
        UserService userService = new UserServiceImpl();
        RatingService ratingService = new RatingServiceImpl();

        // Controllers
        MediaController mediaController = new MediaController(mediaService);
        UserController userController = new UserController(userService);
        RatingController ratingController = new RatingController(ratingService);


        // User
        User user = new User("aren", "1234");
        userController.addUser(user);


        // Movie
        Movie movie = new Movie("Inception", "A science fiction movie", 2010,
                Set.of(Genre.ACTION, Genre.DRAMA), 12, user, 148);


        // Series
        Series series = new Series("Breaking Bad", "A crime drama series", 2008,
                Set.of(Genre.DRAMA), 16, user, 5);


        // Game
        Game game = new Game("Minecraft", "A sandbox game", 2011, Set.of(Genre.FANTASY),
                7, user, 100);


        // Add media through controller
        mediaController.addMedia(movie);
        mediaController.addMedia(series);
        mediaController.addMedia(game);


        // Ratings
        Rating rating1 = new Rating(user, movie, 5, "Very good movie");

        Rating rating2 = new Rating(user, movie, 4, "Great movie");

        ratingController.addRating(rating1);
        ratingController.addRating(rating2);


        // Output users
        System.out.println("--- Users ---");

        for (User currentUser : userController.getAllUsers()) {
            System.out.println(currentUser.getUsername());
        }


        // Output media
        System.out.println("\n--- Media ---");

        for (MediaEntry media : mediaController.getAllMedia()) {
            System.out.println(media.getTitle());
        }


        // Output ratings
        System.out.println("\n--- Ratings for Inception ---");

        for (Rating rating : ratingController.getRatingsByMedia(movie)) {
            System.out.println( rating.getStars() + " stars - " + rating.getComment()
            );
        }

        System.out.println("\n--- Action Movies ---");

        for (MediaEntry media : mediaController.getMediaByGenre(Genre.ACTION)) {
            System.out.println(media.getTitle());
        }

        System.out.println("\n--- Media from 2010 ---");

        for (MediaEntry media : mediaController.getMediaByReleaseYear(2010)) {
            System.out.println(media.getTitle());
        }

        System.out.println("\n--- Media Titles ---");

        for (String title : mediaController.getMediaTitles()) {
            System.out.println(title);
        }


    }
}