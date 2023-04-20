package N1Ex2;

import static N1Ex2.Coche.setModel;

public class App {

    public static void main (String [] args) {

        Coche coche = new Coche(400);
        Coche coche2 = new Coche( 600);
        Coche coche3 = new Coche( 800);

        System.out.println (coche);
        System.out.println (coche2);
        System.out.println (coche3);

        Coche.setModel("A5");

        System.out.println (coche);
        System.out.println (coche2);
        System.out.println (coche3);

        coche.acelerar();
        Coche.frenar();
    }
}
