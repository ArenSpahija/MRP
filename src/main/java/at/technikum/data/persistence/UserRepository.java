package at.technikum.data.persistence;

import at.technikum.business.model.User;

import java.util.List;
import java.util.UUID;

public interface UserRepository {
    void add(User user);

    List<User> getAll();

    User getById(UUID id);
}
