import org.junit.Before;
import org.junit.Test;

import java.sql.SQLOutput;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;




public class ShopTest {

    Guitar guitar;
    Instrument instrument;
    taylorGuitar taylorGuitar;
    taylorGuitar taylorGuitar1;
    taylorGuitar taylorGuitar2;
    ArrayList<ISell> stock;
    Shop shop;
    yamahaPiano yamahaPiano;
    yamahaPiano yamahaPiano1;
    ArrayList<ISell> newStock;
    Stradivarius stradivarius;
    Stradivarius stradivarius1;





    @Before
    public void before() {
        stock = new ArrayList<>();
        stradivarius = new Stradivarius("wood", "brown", "string", 44, "Hmmmm", 10000, 100000);
        yamahaPiano = new yamahaPiano("wood", "black", "percussion", 64, "ting", 2, 300, 500);
        taylorGuitar = new taylorGuitar("wood", "red", "string", 6, false, "twang", 100, 200);
        stock.add(taylorGuitar);
        stock.add(yamahaPiano);
        stock.add(stradivarius);
        shop = new Shop(stock);
        shop.add(stock);

    }
    @Test
    public void checkShop(){
        assertEquals(3, shop.size());
    }

    @Test
    public void checkCanAddToStock() {
        newStock = new ArrayList<ISell>();
        yamahaPiano1 = new yamahaPiano("wood", "black", "percussion", 64, "ting", 2, 300, 500);
        taylorGuitar1 = new taylorGuitar("wood", "red", "string", 6, false, "twang", 100, 200);
        newStock.add(yamahaPiano1);
        newStock.add(taylorGuitar1);
        shop.add(newStock);
        assertEquals(5, shop.size());
    }

    @Test
    public void checkCanRemoveFromStock() {
        newStock = new ArrayList<ISell>();
        newStock.add(yamahaPiano);
        newStock.add(stradivarius1);
        shop.remove(newStock);

        assertEquals(3, shop.size());
    }

    @Test
    public void checkPotentialProfitFromStock(){
        assertEquals(90300.0, shop.getPotentialProfit(stock), 0.0);
    }

}
