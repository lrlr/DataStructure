package Design.designPolicy;

/**
 * @author lirui
 * @ClassName:
 * @Description:
 * @date 2019/4/18 23:59
 */
public class SubCalulator extends Calculator{
    public SubCalulator(int a, int b) {
        super(a, b);
    }
    public int sub(int a,int b){
        return a-b;
    }
}
