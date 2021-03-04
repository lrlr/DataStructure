package Design.designPolicy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @author lirui
 * @ClassName:
 * @Description:
 * @date 2019/4/21 14:37
 */
public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("我要开始吃饭");
    }

    public void walk() {
        System.out.println("我要去抓老鼠");
    }

    public void swim() {
        System.out.println("我要去海里抓小虾米啦");
    }

    @Override
    public HashMap think(HashMap map) {

        return new HashMap();
    }

    public void sleep() {
        System.out.println("我要睡觉");
    }

    public void work(Map map) {
        System.out.println("工作");
    }
}
