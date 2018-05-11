import items.Amp;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AmpTest {

    Amp amp;

    @Before
    public void before() {
        amp = new Amp("Ampeg", "V4-B Head", 850.00, 600, 100);
    }

    @Test
    public void canGetMake() {
        assertEquals("Ampeg", amp.getMake());
    }
    @Test
    public void canGetModel(){
        assertEquals("V4-B Head", amp.getModel());
    }

    @Test
    public void canGetRetailPrice() {
        assertEquals(850.00, amp.getRetailPrice(), 0.1);
    }
    @Test
    public void canGetUnitCost(){
        assertEquals(600.00, amp.getUnitCost(), 0.1);
    }
    @Test
    public void canGetPower(){
        assertEquals(100, amp.getPower());
    }
    @Test
    public void canCalculateMarkUp(){
        assertEquals(250.00, amp.calculateMarkUp(), 0.1);
    }


}
