package Splitwise.Group;

import Splitwise.User.User;
import java.util.HashSet;
import java.util.Set;

public class Group {
    private final String id;
    private final Set<User> members = new HashSet<>();

    public Group(String id) {
        this.id = id;
    }

    public void addMember(User user) {
        members.add(user);
    }

    public Set<User> getMembers() {
        return members;
    }
}
