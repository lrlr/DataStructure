package Design.constructor;

/**
 * @author lirui
 * @ClassName:
 * @Description:
 * @date 2019/4/17 20:45
 */
public class Director {
    private Builder productBuilder;

    public void setBuilder(Builder productBuilder) {
        this.productBuilder = productBuilder;
    }

    public Product makeProduct(String name, String color, String resource, String price) {
        productBuilder.builde(name);
//        productBuilder.buildeColor(color);
//        productBuilder.buildePrice(price);
//        productBuilder.buildeResource(resource);
        return productBuilder.makeProduct();
    }
}
