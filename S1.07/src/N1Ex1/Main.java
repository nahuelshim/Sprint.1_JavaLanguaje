package N1Ex1;

public class Main {

    public static void main(String[] args) {

        OnlineWorker oWorker = new OnlineWorker("Toni", "Montana", 12);
        System.out.println("The salary is: " + oWorker.calculateSalary(120) + "€");

        FaceToFaceWorker ftfWorker = new FaceToFaceWorker("Roberto", "Ayala", 12);
        System.out.println("The salary is: " + ftfWorker.calculateSalary(120) + "€");
    }
}