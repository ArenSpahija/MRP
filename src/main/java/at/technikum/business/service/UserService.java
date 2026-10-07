package at.technikum.business.service;

import at.technikum.business.model.User;

import java.util.List;
import java.util.UUID;

public interface UserService {
    void addUser(User user);

    List<User> getAllUsers();

    User getUserById(UUID id);

    User getUserByUsername(String username);
}
