package Siparis;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ProductItem product1 = new ProductItem("Sut",2, 1.25);
        ProductItem product2 = new ProductItem("Seker", 3, 2.5);
        ServiceItem servis1 = new ServiceItem("Siparis", 5);
        ProductItem product3 = new ProductItem("un", 4, 0.9);

        BundleItem bundle1=new BundleItem("Haftasonu indirimi", new Item[]{
                new ProductItem("Sucuk",2, 15)
        }, 5);


        Order order = new Order(new Item[]{product1, product2, product3, servis1, bundle1});


        order.printItems();

        System.out.println("----------------");
        System.out.println("Total: " + order.getTotalPrice());
    }
}
