package com.lesson6;

public class User {
    private String login;
    private String password;
    private Type type;

    public User(String login, String password, Type type) {
        this.login = login;
        this.password = password;
        this.type = type;
    }

    @Override
    public String toString() {
        return login + " " + password + " " + type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;

        if (!(o instanceof User)) return false;
        User that = (User) o;
        return this.login.equals(that.login) && this.password.equals(that.password) && this.type.equals(that.type);

//      return this.hashCode() == o.hashCode();

    }

    @Override
    public int hashCode() {
        return type.ordinal() + 7 * login.hashCode() + 11 * password.hashCode();
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
