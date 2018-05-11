import items.DrumSticks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {

    DrumSticks drumSticks;

    @Before
    public void before() {
        drumSticks = new DrumSticks("Zildjian", "9 Gauge", 10.00, 7.00);
    }


    @Test
    public void canGetMake() {
        assertEquals("Zildjian", drumSticks.getMake());
    }
    @Test
    public void canGetModel(){
        assertEquals("9 Gauge", drumSticks.getModel());
    }

    @Test
    public void canGetRetailPrice() {
        assertEquals(10.00, drumSticks.getRetailPrice(), 0.1);
    }
    @Test
    public void canGetUnitCost(){
        assertEquals(7.00, drumSticks.getUnitCost(), 0.1);
    }
    @Test
    public void canCalculateMarkUp(){
        assertEquals(3.00, drumSticks.calculateMarkUp(), 0.1);
    }

}
