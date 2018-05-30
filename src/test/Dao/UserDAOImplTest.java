package Dao;

import Entity.User;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class UserDAOImplTest {

    @Test
    public void testGetAllUsers() {
        List<User> users = new UserDAOImpl().getAllUsers();
        assertTrue(users.size() > 0);
    }
}