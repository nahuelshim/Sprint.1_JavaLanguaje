package N1Ex2;

import java.util.ArrayList;
import java.util.List;

public class CalculoDNI {

    static List<String> addLetters () {

        List<String> letterList = new ArrayList<>();

        letterList.add("T"); letterList.add("R");letterList.add("W");letterList.add("A");letterList.add("G");letterList.add("M");letterList.add("Y");letterList.add("F");letterList.add("P");letterList.add("D");
        letterList.add("X");letterList.add("B");letterList.add("N");letterList.add("J");letterList.add("Z");letterList.add("S");letterList.add("Q");letterList.add("V");letterList.add("H");letterList.add("L");
        letterList.add("C");letterList.add("K");letterList.add("E");

        return letterList;
    }

    static String letterCalculate (String numDni, List<String> letterList) {
        int index = (Integer.parseInt(numDni)) %23;
        return letterList.get(index);
    }
}
