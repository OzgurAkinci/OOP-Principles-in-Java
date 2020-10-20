package com.app.oop_principles.encapsulation;

// Encapsulation
public class UserManagement {

    public static void main(String args[]) {
        User user = new User();
        user.setUsername("OzgurAkinci");
        // user.setPassword("1")  <= not accessible (private)
        System.out.println("Username: " + user.getUsername());
        System.out.println("Password: " + user.getPassword());
    }

}
