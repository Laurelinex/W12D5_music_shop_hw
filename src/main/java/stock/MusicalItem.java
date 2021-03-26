package stock;

import behaviours.ISell;

public abstract class MusicalItem implements ISell {

    private String description;
    private double buyingPrice;
    private double sellingPrice;

    public MusicalItem(String description, double buyingPrice, double sellingPrice) {
        this.description = description;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public double calculateMarkup() {
        return sellingPrice - buyingPrice;
    }

}
