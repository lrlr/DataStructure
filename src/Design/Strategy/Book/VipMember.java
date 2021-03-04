package Design.Strategy.Book;

import sun.awt.image.BufferedImageGraphicsConfig;

import java.math.BigDecimal;

/**
 * @author lirui
 * @ClassName:
 * @Description:
 * @date 2019/5/23 19:39
 */
public class VipMember extends StoreStrategy {
    @Override
    public BigDecimal quote(BigDecimal bigDecimal) {
        return bigDecimal.multiply(new BigDecimal(0.6));
    }
}
