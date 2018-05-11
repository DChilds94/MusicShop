import instruments.Banjo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BanjoTest {

    Banjo banjo;

    @Before
    public void before() {
        banjo = new Banjo("Gretsch", "G9420 Broadkaster Supreme", 750.00, 600.00, "String", "Copper", 5);
    }

    @Test
    public void canPlay() {
        assertEquals("Banjo playing", banjo.play("Banjo playing"));
    }
    @Test
    public void canCalculateMarkUp(){
        assertEquals(150.00, banjo.calculateMarkUp(), 0.1);
    }

}
