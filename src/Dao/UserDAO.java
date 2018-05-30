package Dao;

import Entity.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUsers();

    User getMyUser();
}
