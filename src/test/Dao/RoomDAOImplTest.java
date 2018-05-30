package Dao;

import Entity.Room;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class RoomDAOImplTest {

    @Test
    public void testGetAllRooms() {
        List<Room> rooms = new RoomDAOImpl().getAllRooms();
        assertTrue(rooms.size() > 0);
    }
}