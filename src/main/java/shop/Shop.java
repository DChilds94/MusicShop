package shop;

import items.Items;
import items.Sellable;

import java.util.ArrayList;

public class Shop {

    private String name;
    ArrayList<Items> stock;


    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addStock(Items items){
        this.stock.add(items);
    }
    public int countStock(){
        return this.stock.size();
    }



}
