package by.overone.lesson16b.service;

import by.overone.lesson16b.entity.User;

public interface UserService {
    User[] getAllUsers();

    User getUserById(long id);

    User getUserByFullName(String fullName);

    User removeUserById(long id);

    User addUser(User user);

}
