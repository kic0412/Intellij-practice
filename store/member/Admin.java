package com.store.member;

public class Admin extends Person {
    private String id = "Admin";
    private String password = "1234";

    public Admin(String name, int phone) {
        super(name, phone);
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }
}
