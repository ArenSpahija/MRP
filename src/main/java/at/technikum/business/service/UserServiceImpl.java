package at.technikum.business.service;

import at.technikum.business.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class UserServiceImpl implements UserService{
    private final List<User> users;

    public UserServiceImpl() {
        this.users = new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public List<User> getAllUsers() {
        return users;
    }

    @Override
    public User getUserById(UUID id) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }

        return null;
    }

    @Override
    public User getUserByUsername(String username) {
        return users.stream()
                .filter(user -> user.getUsername().equals(username))
                .findFirst()
                .orElse(null);
    }
}
