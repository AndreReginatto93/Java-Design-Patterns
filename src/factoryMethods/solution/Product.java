package factoryMethods.solution;

public class Product {
    private String description;
    private float price;
    private boolean hasDimensions;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean getHasDimensions() {
        return hasDimensions;
    }

    public void setHasDimensions(boolean hasDimensions) {
        this.hasDimensions = hasDimensions;
    }
}
