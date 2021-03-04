package Design.designPolicy;

/**
 * @author lirui
 * @ClassName:计算器
 * @Description:
 * @date 2019/4/18 23:28
 */
public class Calculator {
    private int a;
    private int b;
    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }
    //加法
    public int add(int a,int b) {
        return a + b;
    }
    //减法
    public int sub(int a,int b) {
        return a - b;
    }
    //乘法
    public int mult(int a,int b) {
        return a * b;
    }
    //除法
    public int division(int a,int b) {

        return a / b;
    }
}
