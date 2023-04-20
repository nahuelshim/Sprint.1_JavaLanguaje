package N1Ex1;

import java.util.ArrayList;

public class Sale {

    private ArrayList <Product> productsList;
    private int totalSale;

    public Sale() {

        productsList = new ArrayList <Product>();

    }

    public void addProduct ( Product product) {

        productsList.add(product);
    }

    public void traverseList() throws EmptySaleException{

        if (productsList.size() == 0){
            throw new EmptySaleException();
        }
        for(Product product:productsList) {
            totalSale += product.getPrice();
        }
        System.out.println( "Total sale is: " + totalSale + "€");
    }

    public void calculateTotal () {

        try {
            traverseList();

        } catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }
    }



}