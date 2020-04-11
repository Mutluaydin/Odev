package Siparis;

public class BundleItem extends Item {
    private double discount;
    private Item[] bundleItems ={};
    String label;

    public BundleItem(String label,  Item[] bundleItems, double discount){
        this.label = label;
        this.bundleItems = bundleItems;
        this.discount = discount;

    }


    public double getPrice(){
        double total = 0;
        for (Item bundleItem : bundleItems) {
            total += bundleItem.getPrice();
        }
        return total - (total * discount) / 100;
    }
    public void print(){
        for (Item bundleItem : bundleItems) {
            bundleItem.print();
        }
        System.out.println(label + " : " + " % " + discount + " = " + getPrice()  );
    }

}
