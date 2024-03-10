package factoryMethods.solution;

public class ProductFactory {
    public static Product getInstance(ProductTypeEnum productTypeEnum){
        switch (productTypeEnum){
            case PHYSICAL:
                PhysicalProduct physicalProduct = new PhysicalProduct();
                physicalProduct.setHasDimensions(true);
                return physicalProduct;

            case DIGITAL:
                DigitalProduct digitalProduct = new DigitalProduct();
                digitalProduct.setHasDimensions(false);
                return digitalProduct;

            default: throw new IllegalArgumentException("Product type does not exist");
        }
    }
}
