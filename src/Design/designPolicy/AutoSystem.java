package Design.designPolicy;

import sun.dc.pr.PRError;

/**
 * @author lirui
 * @ClassName:
 * @Description:
 * @date 2019/4/21 16:06
 */
public class AutoSystem {
    private IBike iBike;
    private String type;

    public AutoSystem(IBike iBike) {
        this.iBike = iBike;

    }

    public void auto() {
        iBike.gps();
    }
}
