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




    @Before
    public void before() {
        stock = new ArrayList<>();
        yamahaPiano = new yamahaPiano("wood", "black", "percussion", 64, "ting", 2, 300, 500);
        taylorGuitar = new taylorGuitar("wood", "red", "string", 6, false, "twang", 100, 200);
        stock.add(taylorGuitar);
        stock.add(yamahaPiano);
        shop = new Shop(stock);
        shop.add(stock);

    }
    @Test
    public void checkShop(){
        assertEquals(0, shop.size());
    }

    @Test
    public void checkCanAddToStock() {
        newStock = new ArrayList<ISell>();
        yamahaPiano1 = new yamahaPiano("wood", "black", "percussion", 64, "ting", 2, 300, 500);
        taylorGuitar1 = new taylorGuitar("wood", "red", "string", 6, false, "twang", 100, 200);
        newStock.add(yamahaPiano1);
        newStock.add(taylorGuitar1);
        shop.add(newStock);
        assertEquals(4, shop.size());
    }

    @Test
    public void checkCanRemoveFromStock() {
        newStock = new ArrayList<ISell>();
        newStock.add(yamahaPiano);
        shop.remove(newStock);

        assertEquals(1, shop.size());
    }

}
