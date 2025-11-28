package bankabstract.entity;

import bankabstract.db.Database;

import static bankabstract.db.Database.userslist;

import bankabstract.service.Payment1;

import java.util.Scanner;

public class User {
    public User() {
    }

    public User(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }




    private String name;
    private double balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}

