package Design.designPolicy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lirui
 * @ClassName:
 * @Description:
 * @date 2019/4/21 14:35
 */
public abstract class Animal {
    public abstract void eat();

    public void walk() {
        System.out.println("我要去跑步了");
    }

    public void swim() {
        System.out.println("我要去海里抓小虾米啦");
    }

    public abstract Map think(HashMap map);
    public void work(HashMap map){
        System.out.println("工作");
    }
}
