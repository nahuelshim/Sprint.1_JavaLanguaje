package N1Ex3;

import java.util.ArrayList;

public class List2 {

    static String getPlayer (int num) {

        ArrayList<String> playersList = new ArrayList <>();

        playersList.add("Messi");
        playersList.add("Ronaldo");
        playersList.add("Neymar");

        String player = playersList.get(num);
        return player;

    }
}
