package at.technikum.presentation;

import at.technikum.business.model.User;
import at.technikum.business.service.UserService;

import java.util.List;
import java.util.UUID;

public class UserController{
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void addUser(User user) {
        userService.addUser(user);
    }

    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    public User getUserById(UUID id) {
        return userService.getUserById(id);
    }

    public User getUserByUsername(String username) {
        return userService.getUserByUsername(username);
    }
}
