package Design.designPolicy;

/**
 * @author lirui
 * @ClassName:
 * @Description:
 * @date 2019/4/18 23:54
 */
public class AddCalulator extends Calculator{
    public AddCalulator(int a, int b) {
        super(a, b);
    }
    public int add(int a,int b){
        return a+b;
    }
}
