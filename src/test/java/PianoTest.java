import org.junit.Before;
import org.junit.Test;
import stock.instruments.Guitar;
import stock.instruments.InstrumentType;
import stock.instruments.Piano;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void setUp() {
        piano = new Piano("a home piano", 920.65, 1599.99, InstrumentType.KEYBOARD, "maple", "black", 76);
    }

    @Test
    public void canPlay() {
        assertEquals("Plink-a-plink-a-plink-a-plink", piano.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(679.3, piano.calculateMarkup(), 0.1);
    }

}
