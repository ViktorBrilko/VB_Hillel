package com.lesson8;

import com.lesson6.User;

import java.util.Comparator;

public class UserPriorityComparator implements Comparator<User> {
    public int compare(User a, User b){
        if (a.getType().priority > b.getType().priority) {
            return -1;
        } else if (a.getType().priority < b.getType().priority) {
            return 1;
        } else {
            return 0;
        }

    }
}
