package Design.TemplateMethod.School;

/**
 * @author lirui
 * @ClassName:
 * @Description:
 * @date 2019/5/15 19:00
 */
public class AschoolRegister extends RegisterSchool {
    @Override
    protected void toDormitory() {
        System.out.println("去宿舍报到");
    }

    @Override
    protected void getSupplies() {
        System.out.println("领取锅碗瓢盆");
    }

    @Override
    protected void bill() {
        System.out.println("缴学费，拍照，办理校园卡");
    }

    @Override
    protected void checkIn() {
        System.out.println("去院系报到");
    }
}
