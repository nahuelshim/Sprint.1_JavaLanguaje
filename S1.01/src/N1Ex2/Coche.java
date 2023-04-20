package N1Ex2;

public class Coche {

    private static final String brand = "Audi";
    private static String model = "A1";
    private final int power;

    public Coche (int power) {

        this.power = power;
    }

    public static String getModel() {
        return model;
    }

    public static void setModel(String model) {
        Coche.model = model;
    }

    public void acelerar () {

        System.out.println("El vehículo está acelerando");
    }

    public static void frenar () {

        System.out.println("El vehículo está frenando");
    }

    @Override
    public String toString() {
        return "El coche es de la marca " + brand + ", modelo " + model + " y su potencia es de: " + power + " HP";
    }
}
