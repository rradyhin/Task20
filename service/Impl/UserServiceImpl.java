package by.overone.lesson16b.service.Impl;

import by.overone.lesson16b.entity.User;
import by.overone.lesson16b.repository.Impl.UserRepositoryArrayImpl;
import by.overone.lesson16b.repository.UserRepository;
import by.overone.lesson16b.service.UserService;

public class UserServiceImpl implements UserService {
    private final UserRepository userRepository = new UserRepositoryArrayImpl();

    @Override
    public User[] getAllUsers() {

        return userRepository.getAllUsers();
    }

    @Override
    public User removeUserById(long id) {
        User[] users = getAllUsers();
        for (User user: users) {
            if (user.getId()==id){
                return userRepository.removeUserById(id);
            }
        }
        return new User();
    }

    @Override
    public User addUser(User user) {
        return null;
    }

    @Override
    public User getUserById(long id) {

        return null;
    }

    @Override
    public User getUserByFullName(String fullName) {
        return null;
    }
}
