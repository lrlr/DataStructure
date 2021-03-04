package Design.designPolicy;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @author lirui
 * @ClassName:
 * @Description:
 * @date 2019/4/21 15:29
 */
public class PhyExam implements IPhyExam{
    @Override
    public void chinese() {
        System.out.println("语文");
    }

    @Override
    public void math() {
        System.out.println(" 数学");
    }

    @Override
    public void physics() {
        System.out.println("物理");
    }
}
