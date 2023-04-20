package N1Ex1;

public class Main {

    public static void main(String[] args) {

        int num  = 7;
        int num2 = 10;
        int num3 = 14;

        NoGenericMethods ngm  = new NoGenericMethods(num, num2, num3);
        System.out.println(ngm);

        NoGenericMethods ngm2  = new NoGenericMethods(num2, num3, num);
        System.out.println(ngm2);

    }
}