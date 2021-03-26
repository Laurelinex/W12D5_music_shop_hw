import org.junit.Before;
import org.junit.Test;
import stock.extras.GuitarStrings;
import stock.instruments.Guitar;
import stock.instruments.InstrumentType;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    GuitarStrings strings;

    @Before
    public void setUp() {
        strings = new GuitarStrings("a few strings for your guitar", 10, 20);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(10, strings.calculateMarkup(), 0.0);
    }

}
