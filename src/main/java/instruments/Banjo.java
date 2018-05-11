package instruments;

public class Banjo extends Instruments {

    private int Strings;

    public Banjo(String make, String model, double retailPrice, double unitCost, String family, String material, int strings) {
        super(make, model, retailPrice, unitCost, family, material);
        Strings = strings;
    }

    public int getStrings() {
        return Strings;
    }
}
