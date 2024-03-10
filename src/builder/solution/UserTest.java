package builder.solution;

import java.time.LocalDate;

public class UserTest {
    // Solution
    // With the design pattern builder we were able to create a class with more control and organization,
    // without having to memorize the order of the fields, leaving a more readable and organized code.

    public static void main(String[] args) {
        User user = new User.UserBuilder().
                uid("123456789").
                name("Andre").
                birthDate(LocalDate.of(1999,8,10)).
                build();
    }
}
