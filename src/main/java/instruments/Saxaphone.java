package instruments;

public class Saxaphone extends Instruments{

    private String reed;

    public Saxaphone(String make, String model, double retailPrice, double unitCost, String family, String material, String reed) {
        super(make, model, retailPrice, unitCost, family, material);
        this.reed = reed;
    }

    public String getReed() {
        return reed;
    }

//    wind instrument
}
