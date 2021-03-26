import org.junit.Before;
import org.junit.Test;
import stock.instruments.Guitar;
import stock.instruments.InstrumentType;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp() {
        guitar = new Guitar("an acoustic guitar", 40.50, 79.99, InstrumentType.STRING, "laminate", "beige", 7);
    }

    @Test
    public void canPlay() {
        assertEquals("Dling dling dling", guitar.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(39.5, guitar.calculateMarkup(), 0.1);
    }

}
