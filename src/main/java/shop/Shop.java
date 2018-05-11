package shop;

import instruments.Tuba;
import items.Amp;
import items.Items;
import items.Sellable;

import java.util.ArrayList;

public class Shop {

    private String name;
    ArrayList<Sellable> stock;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public void addStock(Sellable sellable){
        this.stock.add(sellable);
    }
    public int countStock(){
        return this.stock.size();
    }
//    public void removeStock(){
//        this.stock.remove();
//    }
    public void clearStock(){
        this.stock.clear();
    }

//here I want to loop through the ArrayList of sellable items and then get the markUp of that item and add it to the totalMarkUp.
    public double calculateTotalMarkUp(){
        double totalMarkUp = 0.00;
        for(Sellable sellable : this.stock)
        {
        totalMarkUp += sellable.calculateMarkUp();
        }
        return totalMarkUp;
 }

    public void remove(Sellable sellable) {
        this.stock.remove(sellable);
    }
}