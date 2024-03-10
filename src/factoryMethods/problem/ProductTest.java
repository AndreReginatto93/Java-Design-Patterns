package factoryMethods.problem;

public class ProductTest {
    public static void main(String[] args) {
        //The physical product has dimensions and the digital product does not.
        //The problem is that the developer needs to remember to define this every time a product is created.
        //And an error will probably occur soon.

        DigitalProduct digitalProduct = new DigitalProduct();
        digitalProduct.setHasDimensions(false);

        PhysicalProduct physicalProduct = new PhysicalProduct();
        physicalProduct.setHasDimensions(true);
    }
}
