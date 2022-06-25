public abstract class Instrument {

    private String material;
    private String colour;
    private String category;

    public Instrument(String material, String colour, String category) {
        this.material = material;
        this.colour = colour;
        this.category = category;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public String getCategory() {
        return category;
    }
}
