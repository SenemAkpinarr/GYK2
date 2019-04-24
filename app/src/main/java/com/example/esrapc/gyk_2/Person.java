package com.example.esrapc.gyk_2;

public class Person {
    private boolean gender; // woman : true, man : false
    private String username;
    private String accountname;

    public Person(boolean gender, String username, String accountname){
        this.gender = gender;
        this.username = username;
        this.accountname = accountname;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAccountname() {
        return accountname;
    }

    public void setAccountname(String accountname) {
        this.accountname = accountname;
    }
}