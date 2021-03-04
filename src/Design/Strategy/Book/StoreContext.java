package Design.Strategy.Book;

import java.math.BigDecimal;

/**
 * @author lirui
 * @ClassName:
 * @Description:
 * @date 2019/5/23 19:35
 */
public class StoreContext {
    StoreStrategy storeStrategy;

    public StoreContext(StoreStrategy storeStrategy) {
        this.storeStrategy = storeStrategy;
    }

    public BigDecimal quote(BigDecimal bigDecimal) {
        return storeStrategy.quote(bigDecimal);
    }
}
