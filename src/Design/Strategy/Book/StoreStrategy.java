package Design.Strategy.Book;

import java.math.BigDecimal;

/**
 * @author lirui
 * @ClassName:
 * @Description:
 * @date 2019/5/23 19:34
 */
public abstract class StoreStrategy {
    public abstract BigDecimal quote(BigDecimal bigDecimal);
}
