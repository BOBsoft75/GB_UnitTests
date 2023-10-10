package seminars.third.tdd;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {


    List<User> data = new ArrayList<>();

    public void addUser(User user) {
        if (user.isAuthenticate) {
            this.data.add(user);
        }
    }

    public List<User> getData() {
        return data;
    }

    public void logoutUser() {
        for (User user : data) {
            if (!user.isAdmin) {
                user.logout();
            }
        }
    }

    public boolean findByName(String username) {
        for (User user : data) {
            if (user.name.equals(username)) {
                return true;
            }
        }
        return false;
    }

}