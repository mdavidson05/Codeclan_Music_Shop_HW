public class yamahaPiano extends Piano implements ISell{

    private double buyPrice;
    private double sellPrice;

    public yamahaPiano(String material, String colour, String category, int keys, String sound, int pedals, double buyPrice, double sellPrice) {
        super(material, colour, category, keys, sound, pedals);
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public double getBuyPrice(){
        return this.buyPrice;
    }

    public double getSellPrice(){
        return this.sellPrice;
    }


    @Override
    public double calculateMarkup() {
        return this.sellPrice - this.buyPrice;
    }
}

