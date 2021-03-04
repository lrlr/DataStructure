package Design.Strategy.Book;

import java.math.BigDecimal;

/**
 * @author lirui
 * @ClassName:
 * @Description:
 * @date 2019/5/23 19:40
 */
public class StoreMember {
    public static void main(String[] args) {
        VipMember vipMember=new VipMember();
        StoreContext storeContext=new StoreContext(vipMember);
        System.out.println(storeContext.quote(new BigDecimal(100)).setScale(2,BigDecimal.ROUND_HALF_UP)
        );
    }
}
