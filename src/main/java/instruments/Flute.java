package instruments;

public class Flute extends Instruments {

    private String reed;

    public Flute(String make, String model, double retailPrice, double unitCost, String family, String material, String reed) {
        super(make, model, retailPrice, unitCost, family, material);
        this.reed = reed;
    }

    public String getReed() {
        return reed;
    }
}
