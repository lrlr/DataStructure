package Design.Strategy.Book;

import java.math.BigDecimal;

/**
 * @author lirui
 * @ClassName:
 * @Description:
 * @date 2019/5/23 19:38
 */
public class OldMember extends StoreStrategy {
    @Override
    public BigDecimal quote(BigDecimal bigDecimal) {
        return bigDecimal.multiply(new BigDecimal(0.8));
    }
}
