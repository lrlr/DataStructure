package Design.TemplateMethod.LearnEnglish;

/**
 * @author lirui
 * @ClassName:
 * @Description:
 * @date 2019/6/17 8:52
 */
public abstract class EnglishTem {
    public abstract void voice();
    public abstract void read();
    public abstract void repeat();
    public abstract void pratice();
    public abstract void use();
    public void temMethod(){
        voice();
        read();
        repeat();
        pratice();
        use();
    }
}
