package Siparis;

public class Order {
    private Item[] items = {};

    public Order(Item[] items){
        this.items = items;
    }
    public double getTotalPrice(){
        double total = 0 ;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }
    public void printItems(){
        for (Item item : items) {
            item.print();
        }
    }

}
