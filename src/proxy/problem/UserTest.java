package proxy.problem;

import proxy.User;

public class UserTest {

    public static void main(String[] args) {
        // Problem
        // technically there are no problems, but what if you are responsible for implementing a log or cache system,
        // the right thing to do would be to do this in the repository,
        // but it is not good to add code to classes that are already working,
        // and would break SOLID's OCP rule.


        UserService userService = new UserService(new UserRepository());

        User user = new User("Andre");

        userService.save(user);

        User userFound = userService.findById(1);
        System.out.println(userFound.toString());
    }
}
