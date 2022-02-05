package com.lesson8;

import com.lesson6.User;

import java.util.Comparator;


public class UserLoginComparator implements Comparator<User> {
    public int compare(User a, User b) {
        String first = a.getLogin().substring(0).toUpperCase();
        String second = b.getLogin().substring(0).toUpperCase();

        return first.compareTo(second);

    }
}

