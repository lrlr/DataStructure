package Design.designPolicy;

/**
 * @author lirui
 * @ClassName:
 * @Description:
 * @date 2019/4/19 0:02
 */
public class DivisionCalculator extends Calculator {
    public DivisionCalculator(int a, int b) {
        super(a, b);
    }

    public int division(int a, int b) {
        return a / b;
    }
}
