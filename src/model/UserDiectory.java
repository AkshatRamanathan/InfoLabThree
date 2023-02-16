/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author akshb
 */
public class UserDiectory {
    ArrayList<User> allUsers;

    public UserDiectory() {
        this.allUsers = new ArrayList<>();
    }
    
    public ArrayList<User> getAllUsers() {
        return allUsers;
    }

    public void setAllUsers(ArrayList<User> allUsers) {
        this.allUsers = allUsers;
    }
    
    public void addUser(User newUser){
        this.allUsers.add(newUser);
    }
    
    public void removeUser(User user){
        this.allUsers.remove(user);
    }

//    @Override
//    public String toString() {
//        return "UserDiectory{" + "allUsers=" + allUsers + '}';
//    }
    
    
}
