package Entity;

public class Room {
    private int idRoom;
    private int idOwner;
    private int distance;

    public Room() {
    }

    public Room(int idRoom, int idOwner, int distance) {
        this.idRoom = idRoom;
        this.idOwner = idOwner;
        this.distance = distance;
    }

    public int getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(int idRoom) {
        this.idRoom = idRoom;
    }

    public int getIdOwner() {
        return idOwner;
    }

    public void setIdOwner(int idOwner) {
        this.idOwner = idOwner;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

}
