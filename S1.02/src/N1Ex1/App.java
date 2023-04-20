package N1Ex1;

public class App {

    public static void main(String[] args) {


        Product smartphone = new Product("iPhone", 1000);
        Product smartphone2 = new Product("Galaxy", 3000);
        Product smartphone3 = new Product("Motorola", 6000);

        Sale sale = new Sale();

        sale.addProduct(smartphone);
        sale.addProduct(smartphone2);

        sale.calculateTotal();
    }

}
