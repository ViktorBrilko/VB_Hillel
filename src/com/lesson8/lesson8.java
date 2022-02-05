package com.lesson8;

import com.lesson6.Type;
import com.lesson6.User;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class lesson8 {
    public static void main(String[] args) {
        List<User> listUsers = new ArrayList<User>();

        listUsers.add(new User("oleg", "1234", Type.ADMIN));
        listUsers.add(new User("neoleg", "4444", Type.AUTHORIZED));
        listUsers.add(new User("Polly", "qwerty", Type.GUEST));
        listUsers.add(new User("Destroyer", "1489", Type.PREMIUM));
        listUsers.add(new User("Reynolds", "1337", Type.ADMIN));
        listUsers.add(new User("Yanek", "6666", Type.PREMIUM));
        listUsers.add(new User("reliz", "zxcvb", Type.AUTHORIZED));
        listUsers.add(new User("abcd", "asdfg", Type.GUEST));
        listUsers.add(new User("abcDE", "asdfg", Type.GUEST));
        listUsers.add(new User("pamagiti", "poiuy", Type.ADMIN));

        for (int i = 0; i < listUsers.size(); i++) {
            System.out.println(listUsers.get(i).hashCode());
        }

        Comparator<User> ucomp = new UserPriorityComparator().thenComparing(new UserLoginComparator());

        TreeSet<User> treeSetUser = new TreeSet<User>(ucomp);

        treeSetUser.addAll(listUsers);

        System.out.println(treeSetUser);

    }
}

