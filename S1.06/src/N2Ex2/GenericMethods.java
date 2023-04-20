package N2Ex2;

public class GenericMethods <T> {

    public static <T> void print (T... args) {
        for (T arg: args){
            System.out.println(arg);
        }
    }
}
