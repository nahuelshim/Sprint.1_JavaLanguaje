package N1Ex3;

import java.util.ArrayList;

public class List {

    static void getPlayer (int num) {

        ArrayList<String> playersList = new ArrayList <>();

        playersList.add("Messi");
        playersList.add("Ronaldo");
        playersList.add("Neymar");
        String player = "";

        try {
            System.out.println (player = playersList.get(num));
        }catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
