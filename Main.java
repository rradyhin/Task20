package by.overone.lesson16b;

import by.overone.lesson16b.entity.User;
import by.overone.lesson16b.service.Impl.UserServiceImpl;
import by.overone.lesson16b.service.UserService;

public class Main {
    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();

        User removedUser = userService.removeUserById(7);

        if (removedUser.getId() > 0) {
            System.out.println("REMOVED: "+removedUser);
        } else {
            System.out.println("User not found");
        }


        User[] users = userService.getAllUsers();


        for (User user : users) {
            System.out.println(user);
        }

    }
}
