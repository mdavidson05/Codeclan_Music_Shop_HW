import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StradivariusTest implements ISell{

    Violin violin;
    Instrument instrument;
    Stradivarius stradivarius;

    @Before
    public void before(){

        stradivarius = new Stradivarius("wood", "brown", "string", 4, "hmmmm", 10000, 1000000);


    }

    @Test
    public void checkInstrumentMaterial(){
        assertEquals("wood", stradivarius.getMaterial());
    }

    @Test
    public void checkInstrumentColour(){
        assertEquals("brown", stradivarius.getColour());
    }

    @Test
    public void checkInstrumentCategory(){
        assertEquals("string", stradivarius.getCategory());
    }

    @Test
    public void checkInstrumentStrings() {
        assertEquals(4, stradivarius.getStrings());
    }

    @Test
    public void checkSellingMarkup(){
        assertEquals(990000, stradivarius.calculateMarkup(), 0.0);
    }

    @Test
    public void canPlaySound(){
        assertEquals("hmmmm", stradivarius.playSound());
    }

    @Override
    public double calculateMarkup() {
        return 0;
    }
}
