import org.junit.Before;
import org.junit.Test;
import stock.extras.GuitarStrings;
import stock.extras.SheetMusic;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheet;

    @Before
    public void setUp() {
        sheet = new SheetMusic("Hedwig's Theme", 0.90, 9.95);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(9, sheet.calculateMarkup(), 0.1);
    }

}
