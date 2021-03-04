package Design.designPolicy;

/**
 * @author lirui
 * @ClassName:
 * @Description:
 * @date 2019/4/21 15:28
 */
public class ArtsExam implements IArtsExam {
    @Override
    public void chinese() {
        System.out.println("语文");
    }
    @Override
    public void math() {
        System.out.println("数学");
    }
    @Override
    public void geograp() {
        System.out.println("地理");
    }
}
