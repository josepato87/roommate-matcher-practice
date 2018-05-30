package Service;

import Dao.UserDAOImpl;
import Entity.User;

import java.util.ArrayList;
import java.util.List;

public class MatchService {

    List<User> matchedRoommates = new ArrayList<>();

    public List<User> getMatchedRoommates(int distance){
        User myUser = new UserDAOImpl().getMyUser();
        List<User> possibleRoommates = new RoomService().getRoomsOwners(distance);

        for (int i = 0; i < possibleRoommates.size(); i++){
            verifyEmpathy(myUser, possibleRoommates, i);
        }

        return matchedRoommates;
    }

    private void verifyEmpathy(User myUser, List<User> possibleRoommates, int i) {
        int matchMeter = 0;

        if (myUser.isLikesMusic() == possibleRoommates.get(i).isLikesMusic()){
            matchMeter++;
        }
        if (myUser.isLikesSports() == possibleRoommates.get(i).isLikesSports()){
            matchMeter++;
        }
        if (myUser.isLikesToDrink() == possibleRoommates.get(i).isLikesToDrink()){
            matchMeter++;
        }
        if (myUser.isLikesToParty() == possibleRoommates.get(i).isLikesToParty()){
            matchMeter++;
        }
        if (myUser.isLikesToRead() == possibleRoommates.get(i).isLikesToRead()){
            matchMeter++;
        }
        if (myUser.isLikesToTravel() == possibleRoommates.get(i).isLikesToTravel()){
            matchMeter++;
        }
        if (matchMeter > 3){
            matchedRoommates.add(possibleRoommates.get(i));
        }
    }
}
