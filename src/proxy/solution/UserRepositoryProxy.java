package proxy.solution;

import proxy.User;

import java.util.logging.Logger;

public class UserRepositoryProxy extends UserRepository {
    @Override
    public void save(User user) {
        Logger.getLogger(this.getClass().getName()).info("Save Method start...");
        Logger.getLogger(this.getClass().getName()).info("Saving user: " + user.toString());
        super.save(user);
        Logger.getLogger(this.getClass().getName()).info("User saved successfully.");
        Logger.getLogger(this.getClass().getName()).info("Save Method end...");
    }

    @Override
    public User findById(Integer userId) {

        Logger.getLogger(this.getClass().getName()).info("findById Method start...");
        Logger.getLogger(this.getClass().getName()).info("Getting user: " + userId.toString());
        User user = super.findById(userId);
        Logger.getLogger(this.getClass().getName()).info("User found successfully.");
        Logger.getLogger(this.getClass().getName()).info("findById Method end...");

        return user;
    }
}
