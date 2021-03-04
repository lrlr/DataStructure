package Design.TemplateMethod.School;

/**
 * @author lirui
 * @ClassName:
 * @Description:
 * @date 2019/5/15 18:55
 */
public abstract class RegisterSchool {
    public void register(){
        checkIn();//报到
        bill();//缴费
        getSupplies();//领取生活用品
        toDormitory();//去宿舍
        
    }

    protected abstract void toDormitory();

    protected abstract void getSupplies();

    protected abstract void bill();

    protected abstract void checkIn();
}
