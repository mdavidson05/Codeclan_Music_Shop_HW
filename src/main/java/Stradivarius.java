public class Stradivarius extends Violin implements ISell{

    private double buyPrice;
    private double sellPrice;

    public Stradivarius(String material, String colour, String category, int strings, String sound, double buyPrice, double sellPrice) {
        super(material, colour, category, strings, sound);
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }


    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    @Override
    public double calculateMarkup() {
        return this.sellPrice - this.buyPrice;
    }
}
