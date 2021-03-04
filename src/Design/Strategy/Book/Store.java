package Design.Strategy.Book;

import java.math.BigDecimal;

/**
 * @author lirui
 * @ClassName:
 * @Description:
 * @date 2019/5/23 19:25
 */
public class Store {
    public BigDecimal quote(BigDecimal bigDecimal, String type) {
        if ("新会员".equals(type)) {
            return newMember(bigDecimal);
        } else if ("老会员".equals(type)) {
            return oldMember(bigDecimal);
        } else if ("vip会员".equals(type)) {
            return vipMember(bigDecimal);
        }
        return null;
    }

    //新会员不打折
    public BigDecimal newMember(BigDecimal bigDecimal) {
        return bigDecimal;
    }

    //老会员打八折
    public BigDecimal oldMember(BigDecimal bigDecimal) {
        return bigDecimal.multiply(new BigDecimal(0.8));
    }

    //vip会员打六折
    public BigDecimal vipMember(BigDecimal bigDecimal) {
        return bigDecimal.multiply(new BigDecimal(0.6));
    }
}
