public abstract class Guitar extends Instrument implements IPlay {

    private int strings;
    private boolean electric;
    private String sound;

    public Guitar(String material, String colour, String category, int strings, boolean electric, String sound) {
        super(material, colour, category);
        this.strings = strings;
        this.electric = electric;
        this.sound = sound;
    }

    public int getStrings() {
        return this.strings;
    }

    public boolean isElectric() {
        return electric;
    }

    @Override
    public String playSound() {
        return this.sound;
    }


//    public abstract double calculateMarkup();
}
