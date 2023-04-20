package N1Ex5;

import java.io.*;

public class App {

    public static void main(String[] args) {

        Smartphone[] smartphoneList = new Smartphone[2];

        smartphoneList [0] = new Smartphone("Apple", "iPhone 14", 4);
        smartphoneList [1] = new Smartphone("Samsung", "Galaxy S22", 8);

        serializable(smartphoneList);
    }

    public static void serializable (Smartphone[] smartphoneList){

        try {
            ObjectOutputStream writerFile = new ObjectOutputStream(new FileOutputStream("smartphone.ser"));
            writerFile.writeObject(smartphoneList);
            writerFile.close();

            ObjectInput recoveringFile = new ObjectInputStream(new FileInputStream("smartphone.ser"));
            Smartphone[] recoveringSmartphone = (Smartphone[]) recoveringFile.readObject();
            recoveringSmartphone.clone();

            for (Smartphone smartphone : recoveringSmartphone){
                System.out.println(smartphone);
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}