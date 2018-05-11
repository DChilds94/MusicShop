package items;

public class Amp extends Items {

    private int power;

    public Amp(String make, String model, double retailPrice, double unitCost, int power) {
        super(make, model, retailPrice, unitCost);
        power = power;
    }

    public int getPower() {
        return power;
    }

    public double calculateMarkUp(){
        return getRetailPrice() - getUnitCost();
    }
}
