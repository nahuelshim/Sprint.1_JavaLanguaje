package N1Ex2;

public class Main {
    
    public static void main(String[] args) {

        OnlineWorker oWorker = new OnlineWorker("Toni", "Montana", 12);
        oWorker.goToTheOffice();

        FaceToFaceWorker ftfWorker = new FaceToFaceWorker("Roberto", "Ayala", 12);
        ftfWorker.houseWork();
    }
}
