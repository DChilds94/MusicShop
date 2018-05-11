import instruments.BassGuitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BassGuitarTest {

    BassGuitar bassGuitar;

    @Before
    public void before() {
        bassGuitar = new BassGuitar("Hofner", "HCT5001 Voilin Bass", 560.00, 450.00, "String", "Oak", 4);
    }

    @Test
    public void canPlay() {
        assertEquals("Play Bass", bassGuitar.play("Play Bass"));
    }

    @Test
    public void canCalculateMarkUp() {
        assertEquals(110.00, bassGuitar.calculateMarkUp(), 0.1);
    }
}
