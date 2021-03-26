package stock.instruments;

public class Piano extends Instrument {

    private int keyNumber;

    public Piano(String description, double buyingPrice, double sellingPrice, InstrumentType type, String material,
                  String colour, int keyNumber) {
        super(description, buyingPrice, sellingPrice, type, material, colour);
        this.keyNumber = keyNumber;
    }

    public String play() {
        return "Plink-a-plink-a-plink-a-plink";
    }

}
