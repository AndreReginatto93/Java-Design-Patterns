package proxy.solution;

import proxy.User;

import java.util.HashMap;

public class UserRepository {
    private HashMap<Integer, User> DB = new HashMap<Integer, User>();

    private static int countId = 1;

    public void save(User user){
        DB.put(countId++, user);
    }

    public User findById(Integer userId){
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        return DB.get(userId);
    }
}
