package instruments;

import items.Sellable;
import items.Items;

public abstract class Instruments extends Items implements Playable {

    private String family;
    private String material;

    public Instruments(String make, String model, double retailPrice, double unitCost, String family, String material) {
        super(make, model, retailPrice, unitCost);
        this.family = family;
        this.material = material;
    }

    public String getFamily() {
        return family;
    }

    public String getMaterial() {
        return material;
    }

    public final String play(String sound) {
        return sound;
    }
}
