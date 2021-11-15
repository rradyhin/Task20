package by.overone.lesson16b.repository;

import by.overone.lesson16b.entity.User;

public interface UserRepository {
    User[] getAllUsers();

    User getUserById(long id);

    User getUserByFullName(String fullName);

    User removeUserById(long id);

    User addUser(User user);
}
