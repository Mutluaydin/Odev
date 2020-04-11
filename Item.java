package Siparis;

public class Item {
    String description;
    double deger;


    public double getPrice(){
        return deger;
    }

    public void print(){

        System.out.println("Description " + description);
    }

}
