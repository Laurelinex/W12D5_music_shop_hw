import behaviours.ISell;

import java.util.ArrayList;

public class MusicShop {

    private String name;
    private ArrayList<ISell> stock;

    public MusicShop(String name) {
        this.name = name;
        this.stock = new ArrayList<ISell>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void add(ISell item) {
        stock.add(item);
    }

    public void remove(ISell item) {
        stock.remove(item);
    }

    public double calculateTotalPotentialProfit() {
        int total = 0;
        for(ISell item : stock) {
            total += item.calculateMarkup();
        }
        return total;
    }

}
