package N2Ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entry {

    public static byte readByte(String message) {

        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        byte num = 0;

        while (!flag) {

            System.out.println(message);

            try {
                num = sc.nextByte();
                flag = true;

            } catch (InputMismatchException e) {
                System.out.println("Format error, try again");

                sc.nextLine();
            }
        }
        return num;
    }

    public static int readInt(String message) {

        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        int num = 0;

        while (!flag) {

            System.out.println(message);

            try {
                num = sc.nextInt();
                flag = true;

            } catch (InputMismatchException e) {
                System.out.println("Format error, try again");

                sc.nextLine();
            }
        }
        return num;
    }

    public static float readFloat(String message) {

        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        float num = 0;

        while (!flag) {

            System.out.println(message);

            try {
                num = sc.nextFloat();
                flag = true;

            } catch (InputMismatchException e) {
                System.out.println("Format error, try again");

                sc.nextLine();
            }
        }
        return num;
    }

    public static double readDouble(String message) {

        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        double num = 0;

        while (!flag) {

            System.out.println(message);

            try {
                num = sc.nextDouble();
                flag = true;

            } catch (InputMismatchException e) {
                System.out.println("Format error, try again");
                sc.nextLine();
            }
        }
        return num;
    }

    public static char readChar(String message) {

        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        char letter = ' ';
        String word;

        while (!flag) {

            System.out.println(message);

            try {
                word = sc.nextLine();

                if (word.length() < 2) {

                    letter = word.charAt(0);
                    flag = true;

                } else {
                    throw new Exception();
                }

            } catch (Exception e) {
                System.out.println("Format error, try again");
            }
        }
        return letter;
    }

    public static String readString(String message) {

        Scanner sc = new Scanner(System.in);
        boolean read = false;
        String word = "";

        while (!read) {

            System.out.println(message);

            try {
                word = sc.nextLine();
                read = true;

            } catch (Exception e) {
                System.out.println("Format error, try again");
            }
        }
        return word;
    }

    public static boolean readSiNo(String message) {

        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        boolean answer = false;

        while (!flag) {

            System.out.println(message);

            try {
                String word = sc.nextLine();

                if (word.length() < 2) {
                    char letter = word.toLowerCase().charAt(0);

                    if (letter == 's') {
                        answer = true;
                        flag = true;

                    } else if (letter == 'n') {
                        flag = true;

                    } else {
                        throw new Exception();
                    }
                }
            } catch (Exception e) {
                System.out.println("Format error, try again");
            }
        }
        return answer;
    }
}

