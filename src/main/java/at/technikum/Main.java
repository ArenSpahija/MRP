package at.technikum;


import at.technikum.business.model.User;

public class Main {
    public static void main(String[] args) {
        User user = new User("aren", "1234");

        System.out.println("Username: " + user.getUsername());
        System.out.println("ID: " + user.getId());
        System.out.println("Created at: " + user.getCreatedAt());
    }
}