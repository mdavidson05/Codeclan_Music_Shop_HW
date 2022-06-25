public class Violin extends Instrument implements IPlay{

    int strings;
    String sound;

    public Violin(String material, String colour, String category, int strings, String sound) {
        super(material, colour, category);
        this.strings = strings;
        this.sound = sound;
    }

    @Override
    public String playSound() {
        return this.sound;
    }

    public int getStrings() {
        return strings;
    }

}
