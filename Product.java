import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Product {
    String name;
    int price;
    int quontity;

    public Product(String name, int price, int quontity) {
        this.name = name;
        this.price = price;
        this.quontity = quontity;

    }

    static Map<String, Product> inventory = new HashMap<>();

    public static void main(String[] args) {
        metod1();
    }
        public static void metod1(){
        inventory.put("12341", new Product("book", 10, 5));
        inventory.put("12342", new Product("pencil", 15, 10));
        inventory.put("12343", new Product("pencil", 20, 15));
        inventory.put("12353", new Product("pencil", 20, 7));
        inventory.put("12353", new Product("pencil", 20, 100));
        for (Map.Entry<String, Product> x : inventory.entrySet()) {
            Product p = x.getValue();
            if(p.quontity<15) {
                System.out.println("id: " + x.getKey() + "\nname: " + p.name + "\nprice: " + p.price + "\nquontaty: " + p.quontity);
            }
        }
    }
}

