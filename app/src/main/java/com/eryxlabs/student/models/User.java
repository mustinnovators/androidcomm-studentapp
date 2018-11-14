package com.eryxlabs.student.models;

public class User {
    private String fullname;
    //Fields

    //Getters and Setters

   // Constructor - takes the properties of the user.
   // Empty constructor

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public User(String fullname){
        this.fullname = fullname;
    }

}
