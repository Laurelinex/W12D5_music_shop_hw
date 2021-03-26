import org.junit.Before;
import org.junit.Test;
import stock.extras.GuitarStrings;
import stock.extras.SheetMusic;
import stock.instruments.Guitar;
import stock.instruments.InstrumentType;
import stock.instruments.Piano;

import static org.junit.Assert.assertEquals;

public class MusicShopTest {

    MusicShop shop;
    Piano piano;
    SheetMusic sheet;

    @Before
    public void setUp() {
        shop = new MusicShop("Sticks And Strings");
        sheet = new SheetMusic("Hedwig's Theme", 0.90, 9.95);
        piano = new Piano("a home piano", 920.65, 1599.99, InstrumentType.KEYBOARD, "maple", "black", 76);
    }

    @Test
    public void stockStartsEmpty() {
        assertEquals(0, shop.getStock().size());
    }

    @Test
    public void canAddItemToStock() {
        shop.add(piano);
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void canRemoveItemFromStock() {
        shop.add(piano);
        shop.remove(piano);
        assertEquals(0, shop.getStock().size());
    }

}
