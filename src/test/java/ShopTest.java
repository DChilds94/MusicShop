import instruments.BassGuitar;
import instruments.Playable;
import items.Amp;
import items.Sellable;
import org.junit.Before;
import org.junit.Test;
import shop.Shop;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ShopTest {

    Shop shop;
    Playable playable;
    Sellable sellable;
    Amp amp;
    BassGuitar bassGuitar;

    @Before
    public void before() {
        bassGuitar = new BassGuitar("Hofner", "HCT5001 Voilin Bass", 560.00, 450.00, "String", "Oak", 4);
        amp = new Amp("Ampeg", "V4-B Head", 850.00, 600, 100);
        shop = new Shop("Upul's Love Songs");
    }

    @Test
    public void canGetName() {
        assertEquals("Upul's Love Songs", shop.getName());
    }
    @Test
    public void canAddItemToStock(){
        shop.addStock(bassGuitar);
        assertEquals(1, shop.countStock());
    }
}
