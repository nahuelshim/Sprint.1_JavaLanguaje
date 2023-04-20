package N1Ex1;

public class FaceToFaceWorker extends Worker{

    private static int gasoline;

    public FaceToFaceWorker(String name, String lastName, int priceHour) {
        super(name, lastName, priceHour);
        gasoline = 50;
    }

    @Override
    public int calculateSalary(int hours) {
        int salary = (hours * getPriceHour()) + gasoline;
        return salary;
    }
}
