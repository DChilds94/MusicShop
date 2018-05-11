import instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void before() {
        trumpet = new Trumpet("Bach", "180-37 ML", 2529.99, 2000.00, "Brass", "Brass");
    }

    @Test
    public void getMake() {
        assertEquals("Bach", trumpet.getMake());
    } @Test
    public void getModel() {
        assertEquals("180-37 ML", trumpet.getModel());
    } @Test
    public void getRetailPrice() {
        assertEquals(2529.99, trumpet.getRetailPrice(), 0.1);
    } @Test
    public void getUnitCost() {
        assertEquals(2000.00, trumpet.getUnitCost(), 0.1);
    } @Test
    public void getFamily() {
        assertEquals("Brass", trumpet.getFamily());
    } @Test
    public void getMaterial() {
        assertEquals("Brass", trumpet.getMaterial());
    } @Test
    public void calculateMarkUp() {
        assertEquals(529.99, trumpet.calculateMarkUp(), 0.1);
    }
    @Test
    public void canPlay() {
        assertEquals("Playing Music", trumpet.play("Playing Music"));
    }
}
