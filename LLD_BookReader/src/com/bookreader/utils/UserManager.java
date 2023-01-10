package com.bookreader.utils;
import java.util.HashMap;

import com.bookreader.beans.User;

public class UserManager {
    private HashMap<Integer, User> users;

    public UserManager() {
        users = new HashMap<Integer, User>();
    }

    public boolean addUser(User user) {
        int userId = user.getId();
        if(!users.containsKey(userId)) {
            users.put(userId, user);
            return true;
        }
        return false;
    }

    public boolean removeUser(int userId) {
        if(users.containsKey(userId)) {
            users.remove(userId);
            return true;
        }
        return false;
    }

    public User findUser(int userId) {
        return users.get(userId);
    }
    
    
}
