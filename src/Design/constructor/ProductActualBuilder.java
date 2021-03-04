package Design.constructor;

/**
 * @author lirui
 * @ClassName:
 * @Description:
 * @date 2019/4/17 20:41
 */
public class ProductActualBuilder extends Builder {
    private Product product = new Product();

    @Override
    public void builde(String name) {

    }
//
//    @Override
//    public void buildeResource(String resource) {
//        product.setResource(resource);
//    }
//
//    @Override
//    public void buildeColor(String color) {
//        product.setColor(color);
//    }
//
//    @Override
//    public void buildePrice(String price) {
//        product.setPrice(price);
//    }

    @Override
    public Product makeProduct() {
//        return null;
        return product;
    }
}
