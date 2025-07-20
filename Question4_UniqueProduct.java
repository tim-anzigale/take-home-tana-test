import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Question4_UniqueProduct {
    public static void main(String[] args) {
        List<String> products = new ArrayList<>();
        products.add("Apple");
        products.add("Computer");
        products.add("Apple");
        products.add("Bag");

        String result = firstUniqueProduct(products);
        System.out.println("First unique product: " + result);
    }
    
    public static String firstUniqueProduct(List<String> products) {
        String firstUnique = null;
        for (String product : products) {
            if (Collections.frequency(products, product) == 1) {
                firstUnique = product;
                break;
            }
        }
        return firstUnique;
    }
}