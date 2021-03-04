package Design.designPolicy;

/**
 * @author lirui
 * @ClassName:
 * @Description:
 * @date 2019/4/19 0:04
 */
public class MultCalculator extends Calculator {
    public MultCalculator(int a, int b) {
        super(a, b);
    }
    public int mult(int a,int b){
        return a*b;
    }
}
