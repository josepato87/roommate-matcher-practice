package Service;

import Dao.RoomDAOImpl;
import Dao.UserDAOImpl;
import Entity.Room;
import Entity.User;

import java.util.ArrayList;
import java.util.List;

public class RoomService {
    List<User> roomOwners = new ArrayList<>();
    List<Room> roomsByDistance = new ArrayList<>();

    public List<User> getRoomsOwners(int distance){
        roomsByDistance = getRoomsByDistance(distance);
        List<User> allUsers = new UserDAOImpl().getAllUsers();

        for(int i = 0; i < roomsByDistance.size(); i++) {
            for (int j = 0; j < allUsers.size(); j++) {
                if (roomsByDistance.get(i).getIdOwner() == allUsers.get(j).getIdUser()) {
                    roomOwners.add(allUsers.get(j));
                    break;
                }
            }
        }

        return roomOwners;
    }

    private List<Room> getRoomsByDistance(int distance){
        List<Room> allRooms = new RoomDAOImpl().getAllRooms();

        for (int i = 0; i < allRooms.size(); i++){
            if (allRooms.get(i).getDistance() <= distance){
                roomsByDistance.add(allRooms.get(i));
            }
        }

        return roomsByDistance;
    }
}
