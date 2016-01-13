package com.example.ilyan.login_register;

public class User {
    String name, username, password, mail, ville;
    int age;

    public User (String name, int age, String username, String password, String mail, String ville){
        this.name = name;
        this.age = age;
        this.username = username;
        this.password = password;
        this.mail = mail;
        this.ville = ville;
    }

    public User(String username, String password){
        this.username = username;
        this.password = password;
        this.age = -1;
        this.name ="";

    }



}
