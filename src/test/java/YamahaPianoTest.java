import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class YamahaPianoTest implements ISell{

    Piano piano;
    Instrument instrument;
    yamahaPiano yamahaPiano;

    @Before
    public void before(){

        yamahaPiano = new yamahaPiano("wood", "black", "percussion", 64, "ting", 2, 300, 500);


    }

    @Test
    public void checkInstrumentMaterial(){
        assertEquals("wood", yamahaPiano.getMaterial());
    }

    @Test
    public void checkInstrumentColour(){
        assertEquals("black", yamahaPiano.getColour());
    }

    @Test
    public void checkInstrumentCategory(){
        assertEquals("percussion", yamahaPiano.getCategory());
    }

    @Test
    public void checkInstrumentKeys(){
        assertEquals(64, yamahaPiano.getKeys());
    }

    @Test
    public void checkInstrumentPedals(){
        assertEquals(2, yamahaPiano.getPedals());
    }

    @Test
    public void checkSellingMarkup(){
        assertEquals(200, yamahaPiano.calculateMarkup(), 0.0);
    }

    @Test
    public void canPlaySound(){
        assertEquals("ting", yamahaPiano.playSound());
    }

    @Override
    public double calculateMarkup() {
        return 0;
    }
}
