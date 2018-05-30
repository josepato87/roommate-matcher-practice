package Controller;

import Entity.User;
import Service.MatchService;

import java.util.ArrayList;
import java.util.List;

public class MatchController {
    public ArrayList getMatches(int distance){
        List<User> matchedRoommates = new MatchService().getMatchedRoommates(distance);
        ArrayList names = new ArrayList();
        for (int i = 0; i < matchedRoommates.size(); i++){
            names.add(matchedRoommates.get(i).getName());
        }
        return names;
    }

    //retorna roommates que hicieron match para aceptar o pasar
}
