package N2Ex1;

public class GenericMethods <T>{

    public static <T> void print (Person element1, T element2, T element3) {
        System.out.println (element1 + " " + element2 + " " + element3 );
    }
}
