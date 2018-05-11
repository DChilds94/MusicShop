package items;
import items.Items;

public class GuitarStrings extends Items {

    private String Type;
    private int amountInPack;

    public GuitarStrings(String make, String model, double retailPrice, double unitCost, String type, int amountInPack) {
        super(make, model, retailPrice, unitCost);
        Type = type;
        this.amountInPack = amountInPack;
    }

    public String getType() {
        return Type;
    }

    public int getAmountInPack() {
        return amountInPack;
    }
}
