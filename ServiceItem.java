package Siparis;

public class ServiceItem extends Item {

    double price;


    public ServiceItem(String description, double price){
        this.description = description;
        this.price = price;
    }


    public double getPrice() {
        deger = price;
        return deger;
    }


    public void print() {
        System.out.println(description + " : " + price);
    }
}
