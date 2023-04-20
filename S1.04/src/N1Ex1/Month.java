package N1Ex1;

import java.util.ArrayList;
import java.util.List;

public class Month {

    static List<String> insertMonth (){

        List <String> monthList = new ArrayList<>();

        monthList.add("January");
        monthList.add("February");
        monthList.add("March");
        monthList.add("April");
        monthList.add("May");
        monthList.add("June");
        monthList.add("July");
        monthList.add("August");
        monthList.add("September");
        monthList.add("October");
        monthList.add("November");
        monthList.add("December");

        return monthList;
    }

   static int sizeList (List<String> monthList) {
        return monthList.size();
    }

    static String getMonth (List <String> monthList) {
        String month = monthList.get(7);
        return month;
    }

    static boolean isEmpty (List <String> monthList) {
        return monthList.isEmpty();
    }

}

