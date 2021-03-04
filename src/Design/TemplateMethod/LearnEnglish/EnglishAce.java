package Design.TemplateMethod.LearnEnglish;

import Design.TemplateMethod.LearnEnglish.EnglishTem;

/**
 * @author lirui
 * @ClassName:
 * @Description:
 * @date 2019/6/17 8:55
 */
public class EnglishAce extends EnglishTem {
    @Override
    public void voice() {
        System.out.println("发音");
    }

    @Override
    public void read() {
        System.out.println("阅读");
    }

    @Override
    public void repeat() {
        System.out.println("重复");
    }

    @Override
    public void pratice() {
        System.out.println("练习");
    }

    @Override
    public void use() {
        System.out.println("使用");
    }
}
