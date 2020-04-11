package Siparis;

public class ProductItem extends Item{
    double amount;
    double pricePerUnit;


    public ProductItem(String description, double amount, double pricePerUnit){
        this.description = description;
        this.amount = amount;
        this.pricePerUnit = pricePerUnit;
    }
    public double getPrice(){
        deger = amount * pricePerUnit;
        return deger;
    }

    public void print(){
        System.out.println(description + " : " + amount + " * " + pricePerUnit);

    }

}
