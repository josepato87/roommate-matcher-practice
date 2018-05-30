import Controller.MatchController;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        MatchController matchController = new MatchController();

        ArrayList names = matchController.getMatches(8);

        System.out.println("Hello World!");
    }
}
