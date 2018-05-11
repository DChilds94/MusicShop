import items.GuitarStrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    GuitarStrings guitarStrings;

    @Before
    public void before() {
        guitarStrings = new GuitarStrings("Ernie Ball", "Slink Nickel Wound", 15.00, 10.00, "6 String Guitar", 6);
    }

    @Test
    public void canCalculateMarkUp() {
        assertEquals(5.00, guitarStrings.calculateMarkUp(), 0.1);
    }
}
