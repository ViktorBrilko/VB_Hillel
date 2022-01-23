package com.company;

public enum Type {
    ADMIN (0),
    PREMIUM (1),
    AUTHORIZED (2),
    GUEST (3);

    public int priority;

    private Type(int priority) {
        this.priority = priority;
    }
}
