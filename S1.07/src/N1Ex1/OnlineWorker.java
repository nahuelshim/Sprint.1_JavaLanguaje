package N1Ex1;

public class OnlineWorker extends Worker {

    private static final int internet = 20;

    public OnlineWorker(String name, String lastName, int priceHour) {
        super(name, lastName, priceHour);
    }

    @Override
    public int calculateSalary(int hours) {
        int salary = (hours * getPriceHour()) + internet;
        return salary;
    }
}
