import java.util.ArrayList;

public class Shop implements ISell{

    public ArrayList<ISell> stock; //remove public after test
    private Instrument instrument;
//    private ArrayList<ISell> newStock;



    public Shop(ArrayList<ISell> stock) {
        this.stock = new ArrayList<>();
    }

//    @Override
//    public double calculateMarkup() {
//        for (ISell item: this.stock) {
//
//        }
//    }

    public int size() {
        return stock.size();
    }

    public void remove(ArrayList<ISell> newStock) {
        stock.remove(newStock);
    }


    public void add(ArrayList<ISell> newStock) {
        for (ISell item: newStock
        ) {
            stock.add(item);
        }
    }

    public double getPotentialProfit(ArrayList<ISell> stock) {
        double profit = 0;
        for (ISell item: stock
        ) {
            profit += item.calculateMarkup();

        }
        return profit;
    }

    @Override
    public double calculateMarkup() {
        return 0;
    }
}
