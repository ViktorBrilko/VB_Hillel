package com.lesson6;

public class test {
    public static void main(String[] args) {
        User user1 = new User("aaa", "bbb", Type.ADMIN);
        User user2 = new User("aaa", "bbb", Type.ADMIN);

        System.out.println("Your User information - " + user1.toString());
        System.out.println("Your User information - " + user2.toString());

        if (user1.equals(user2)) {
            System.out.println("Your Users are same");
        } else {
            System.out.println("Your Users are different");
        }

        System.out.println("hashCode - " + user1.hashCode());
        System.out.println("hashCode - " + user2.hashCode());

    }
}
