package proxy.solution;

import proxy.User;

public class UserService {
    private final UserRepositoryProxy userRepositoryProxy;

    UserService(UserRepositoryProxy userRepository){
        this.userRepositoryProxy = userRepository;
    }

    public void save(User user){
        userRepositoryProxy.save(user);
    }

    public User findById(Integer userId){
        return userRepositoryProxy.findById(userId);
    }
}
