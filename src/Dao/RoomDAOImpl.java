package Dao;

import Entity.Room;

import java.util.ArrayList;
import java.util.List;

public class RoomDAOImpl implements RoomDAO {

    List<Room> rooms = new ArrayList<>();

    public RoomDAOImpl() {
        Room room1 = new Room(1, 2, 5);
        rooms.add(room1);
        Room room2 = new Room(2, 3, 20);
        rooms.add(room2);
        Room room3 = new Room(3, 4, 2);
        rooms.add(room3);
        Room room4 = new Room(4, 5, 15);
        rooms.add(room4);
        Room room5 = new Room(5, 6, 10);
        rooms.add(room5);
        Room room6 = new Room(6, 7, 7);
        rooms.add(room6);
        Room room7 = new Room(7, 8, 13);
        rooms.add(room7);
        Room room8 = new Room(8, 9, 17);
        rooms.add(room8);
        Room room9 = new Room(9, 10, 1);
        rooms.add(room9);
        Room room10 = new Room(10, 11, 16);
        rooms.add(room10);
    }

    @Override
    public List<Room> getAllRooms() {
        return rooms;
    }
}
