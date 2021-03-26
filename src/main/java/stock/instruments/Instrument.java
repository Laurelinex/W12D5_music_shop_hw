package stock.instruments;

import behaviours.IPlay;
import stock.MusicalItem;

public abstract class Instrument extends MusicalItem implements IPlay {

    private InstrumentType type;
    private String material;
    private String colour;

    public Instrument(String description, double buyingPrice, double sellingPrice, InstrumentType type,
                      String material, String colour) {
        super(description, buyingPrice, sellingPrice);
        this.type = type;
        this.material = material;
        this.colour = colour;
    }

}
