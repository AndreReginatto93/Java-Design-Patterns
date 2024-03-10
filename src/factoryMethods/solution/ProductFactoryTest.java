package factoryMethods.solution;

public class ProductFactoryTest {
    public static void main(String[] args) {
        //The physical product has dimensions and the digital product does not.
        // With the design pattern Factory Method we were able to create a class with more control and organization.
        // without having to remember to set the properties correctly every time.

        Product digitalProduct = ProductFactory.getInstance(ProductTypeEnum.DIGITAL);
        Product physicalProduct = ProductFactory.getInstance(ProductTypeEnum.PHYSICAL);
    }
}
