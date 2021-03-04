package Design.Strategy;

/**
 * @author lirui
 * @ClassName:上下文
 * @Description:
 * @date 2019/5/23 19:18
 */
public class Context {
    private Strategy strategy;
    public Context(Strategy strategy){
        this.strategy=strategy;
    }
    //根据具体策略对象调用其算法
    public void contextInterface(){
        strategy.AlgorithmInterface();
    }
}
