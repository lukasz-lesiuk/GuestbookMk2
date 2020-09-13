package com.example.guestbook.service;

import org.springframework.stereotype.Service;
import com.example.guestbook.dao.GuestsDao;
import com.example.guestbook.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class userService {

    private GuestsDao guestsDao;

    public userService(GuestsDao guestsDao) {
        this.guestsDao = guestsDao;
    }

    public List<User> getUsers() {
        return guestsDao.getUsers();
    }

    public Optional<User> getUserById(int id) {
        for(User user : guestsDao.getUsers()) {
            if (user.getId() == id) {
                return Optional.of(user);
            }
        }
        return Optional.of(null);
    }

    public void addUser(User user) {
        guestsDao.addUser(user);
    }
}

