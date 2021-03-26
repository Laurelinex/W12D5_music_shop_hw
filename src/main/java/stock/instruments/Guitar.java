package stock.instruments;

public class Guitar extends Instrument {

    private int stringNumber;

    public Guitar(String description, double buyingPrice, double sellingPrice, InstrumentType type, String material,
                  String colour, int stringNumber) {
        super(description, buyingPrice, sellingPrice, type, material, colour);
        this.stringNumber = stringNumber;
    }

    public String play() {
        return "Dling dling dling";
    }

}
