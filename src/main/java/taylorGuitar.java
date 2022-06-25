public class taylorGuitar extends Guitar implements ISell{

    private double buyPrice;
    private double sellPrice;

    public taylorGuitar(String material, String colour, String category, int strings, boolean electric, String sound, double buyPrice, double sellPrice) {
        super(material, colour, category, strings, electric, sound);
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
