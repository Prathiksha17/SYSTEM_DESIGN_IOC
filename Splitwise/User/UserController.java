package Splitwise.User;

import java.util.HashMap;
import java.util.Map;

public class UserController {
    private final Map<String, User> users = new HashMap<>();

    public User addUser(String id, String name) {
        users.putIfAbsent(id, new User(id, name));
        return users.get(id);
    }

    public Map<String, User> getAllUsers() {
        return users;
    }
}
