package items;

public  abstract class Items implements Sellable {
    private String make;
    private String model;
    private double retailPrice;
    private double unitCost;

    public Items(String make, String model, double retailPrice, double unitCost) {
        this.make = make;
        this.model = model;
        this.retailPrice = retailPrice;
        this.unitCost = unitCost;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public double getUnitCost() {
        return unitCost;
    }

    public double calculateMarkUp(){
        return retailPrice -= unitCost;
    }


}
