package proxy.solution;

import proxy.User;

public class UserTest {

    public static void main(String[] args) {
        // Solution
        // With the design pattern proxy we were able to add logs without breaking an existing code,
        // and making the code clean and organized.


        UserService userService = new UserService(new UserRepositoryProxy());

        User user = new User("Andre");

        userService.save(user);

        User userFound = userService.findById(1);
        System.out.println(userFound.toString());
    }
}
