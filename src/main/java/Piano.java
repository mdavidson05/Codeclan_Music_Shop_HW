public abstract class Piano extends Instrument implements IPlay {

    private int keys;
    private String sound;
    private int pedals;

    public Piano(String material, String colour, String category, int keys, String sound, int pedals) {
        super(material, colour, category);
        this.keys = keys;
        this.sound = sound;
        this.pedals = pedals;
    }

    public int getKeys() {
        return this.keys;
    }

    public int getPedals() {
        return this.pedals;
    }

    @Override
    public String playSound() {
        return this.sound;
    }


//    public abstract double calculateMarkup();
}
