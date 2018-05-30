package Dao;

import Entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl implements UserDAO{

    User myUser = new User();
    List<User> users = new ArrayList<>();

    public UserDAOImpl() {
        User user1 = new User();
        user1.setIdUser(1);
        user1.setName("JP");
        user1.setLikesMusic(true);
        user1.setLikesSports(true);
        user1.setLikesToDrink(false);
        user1.setLikesToParty(false);
        user1.setLikesToRead(true);
        user1.setLikesToTravel(true);
        users.add(user1);

        User user2 = new User();
        user2.setIdUser(2);
        user2.setName("Owner1");
        user2.setLikesMusic(true);
        user2.setLikesSports(true);
        user2.setLikesToDrink(true);
        user2.setLikesToParty(true);
        user2.setLikesToRead(true);
        user2.setLikesToTravel(true);
        users.add(user2);

        User user3 = new User();
        user3.setIdUser(3);
        user3.setName("Owner2");
        user3.setLikesMusic(false);
        user3.setLikesSports(false);
        user3.setLikesToDrink(false);
        user3.setLikesToParty(false);
        user3.setLikesToRead(false);
        user3.setLikesToTravel(false);
        users.add(user3);

        User user4 = new User();
        user4.setIdUser(4);
        user4.setName("Owner3");
        user4.setLikesMusic(true);
        user4.setLikesSports(false);
        user4.setLikesToDrink(true);
        user4.setLikesToParty(true);
        user4.setLikesToRead(false);
        user4.setLikesToTravel(true);
        users.add(user4);

        User user5 = new User();
        user5.setIdUser(5);
        user5.setName("Owner4");
        user5.setLikesMusic(true);
        user5.setLikesSports(false);
        user5.setLikesToDrink(false);
        user5.setLikesToParty(true);
        user5.setLikesToRead(true);
        user5.setLikesToTravel(false);
        users.add(user5);

        User user6 = new User();
        user6.setIdUser(6);
        user6.setName("Owner5");
        user6.setLikesMusic(true);
        user6.setLikesSports(true);
        user6.setLikesToDrink(false);
        user6.setLikesToParty(false);
        user6.setLikesToRead(true);
        user6.setLikesToTravel(true);
        users.add(user6);

        User user7 = new User();
        user7.setIdUser(7);
        user7.setName("Owner6");
        user7.setLikesMusic(true);
        user7.setLikesSports(true);
        user7.setLikesToDrink(false);
        user7.setLikesToParty(false);
        user7.setLikesToRead(true);
        user7.setLikesToTravel(true);
        users.add(user7);

        User user8 = new User();
        user8.setIdUser(8);
        user8.setName("Owner7");
        user8.setLikesMusic(true);
        user8.setLikesSports(true);
        user8.setLikesToDrink(false);
        user8.setLikesToParty(false);
        user8.setLikesToRead(true);
        user8.setLikesToTravel(true);
        users.add(user8);

        User user9 = new User();
        user9.setIdUser(9);
        user9.setName("Owner8");
        user9.setLikesMusic(false);
        user9.setLikesSports(true);
        user9.setLikesToDrink(true);
        user9.setLikesToParty(false);
        user9.setLikesToRead(true);
        user9.setLikesToTravel(true);
        users.add(user9);

        User user10 = new User();
        user10.setIdUser(10);
        user10.setName("Owner9");
        user10.setLikesMusic(true);
        user10.setLikesSports(false);
        user10.setLikesToDrink(false);
        user10.setLikesToParty(false);
        user10.setLikesToRead(true);
        user10.setLikesToTravel(true);
        users.add(user10);

        User user11 = new User();
        user11.setIdUser(11);
        user11.setName("Owner10");
        user11.setLikesMusic(false);
        user11.setLikesSports(false);
        user11.setLikesToDrink(true);
        user11.setLikesToParty(true);
        user11.setLikesToRead(false);
        user11.setLikesToTravel(false);
        users.add(user11);
    }

    @Override
    public List<User> getAllUsers() {
        return users;
    }

    @Override
    public User getMyUser() {
        myUser.setIdUser(users.get(0).getIdUser());
        myUser.setName(users.get(0).getName());
        myUser.setLikesMusic(users.get(0).isLikesMusic());
        myUser.setLikesSports(users.get(0).isLikesSports());
        myUser.setLikesToDrink(users.get(0).isLikesToDrink());
        myUser.setLikesToParty(users.get(0).isLikesToParty());
        myUser.setLikesToRead(users.get(0).isLikesToRead());
        myUser.setLikesToTravel(users.get(0).isLikesToTravel());

        return myUser;
    }
}
