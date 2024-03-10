package proxy.problem;

import proxy.User;

public class UserService {
    private final UserRepository userRepository;

    UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public void save(User user){
        userRepository.save(user);
    }

    public User findById(Integer userId){
        return userRepository.findById(userId);
    }
}
