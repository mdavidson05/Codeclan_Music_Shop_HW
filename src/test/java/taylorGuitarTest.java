import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;




public class taylorGuitarTest {

    Guitar guitar;
    Instrument instrument;
    taylorGuitar taylorGuitar;

    @Before
    public void before(){

        taylorGuitar = new taylorGuitar("wood", "red", "string", 6, false, "twang", 100, 200);


    }

    @Test
    public void checkInstrumentMaterial(){
        assertEquals("wood", taylorGuitar.getMaterial());
    }

    @Test
    public void checkInstrumentColour(){
        assertEquals("red", taylorGuitar.getColour());
    }

    @Test
    public void checkInstrumentCategory(){
        assertEquals("string", taylorGuitar.getCategory());
    }

    @Test
    public void checkInstrumentStrings(){
        assertEquals(6, taylorGuitar.getStrings());
    }

    @Test
    public void checkInstrumentElectric(){
        assertEquals(false, taylorGuitar.isElectric());
    }

    @Test
    public void checkSellingMarkup(){
        assertEquals(100, taylorGuitar.calculateMarkup(), 0.0);
    }

    @Test
    public void canPlaySound(){
        assertEquals("twang", taylorGuitar.playSound());
    }
}
