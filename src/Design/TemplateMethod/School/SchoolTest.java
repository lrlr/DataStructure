package Design.TemplateMethod.School;

import java.util.ResourceBundle;

/**
 * @author lirui
 * @ClassName:
 * @Description:
 * @date 2019/5/15 19:07
 */
public class SchoolTest {
    public static void main(String[] args) {
        RegisterSchool registerSchoolA=new AschoolRegister();
        RegisterSchool registerSchoolB=new BschoolRegister();
        registerSchoolA.register();
        registerSchoolB.register();
    }
}
