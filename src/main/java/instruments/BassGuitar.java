package instruments;

public class BassGuitar extends Instruments {

    private int amountOfString;

    public BassGuitar(String make, String model, double retailPrice, double unitCost, String family, String material, int amountOfString) {
        super(make, model, retailPrice, unitCost, family, material);
        this.amountOfString = amountOfString;
    }

    public int getAmountOfString() {
        return amountOfString;
    }
}
