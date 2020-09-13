package com.example.guestbook.dao;

import com.example.guestbook.model.User;

import java.util.List;

public interface GuestsDao {
    List<User> getUsers();
    void addUser(User user);
}
