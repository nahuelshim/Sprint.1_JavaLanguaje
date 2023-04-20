package N1Ex1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        ArrayList <Month> months = new ArrayList <>();

        months.add(new Month("January"));
        months.add(new Month("February"));
        months.add(new Month("March"));
        months.add(new Month("April"));
        months.add(new Month("May"));
        months.add(new Month("June"));
        months.add(new Month("July"));
        months.add(new Month("September"));
        months.add(new Month("October"));
        months.add(new Month("November"));
        months.add(new Month("December"));

        months.add (7, new Month ("August"));

        for (Month month: months){
            System.out.println(month.getName()); // Imprime ArrayList con bucle for
        }

        System.out.println("-----------------------------");
        Set<Month> monthsSet = new HashSet<>(months);

        monthsSet.add(new Month("September"));

        for (Month i: monthsSet) {
            System.out.println(i.getName()); // Imprime HashSet con bucle

        }

        System.out.println("-----------------------------");

        Iterator<Month> it = monthsSet.iterator();

        while (it.hasNext()) {
            System.out.println (it.next().getName()); //Imprime HashSet con iterador

        }

    }

}