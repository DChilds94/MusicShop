package shop;

import items.Items;

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


}
