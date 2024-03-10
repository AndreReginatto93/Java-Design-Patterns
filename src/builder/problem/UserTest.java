package builder.problem;

import java.time.LocalDate;

public class UserTest {
    // Problem
    // To create an object with multiple attributes, the constructor can get long and confusing.

    public static void main(String[] args) {
        User user1 = new User("123456789", "Andre", LocalDate.of(1999,8,10));
    }
}
