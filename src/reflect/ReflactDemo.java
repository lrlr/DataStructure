package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author lirui
 * @ClassName:
 * @Description:
 * @date 2019/7/2 9:56
 */
public class ReflactDemo {
    public static void main(String[] args) throws Exception {
        Class<?> student = Class.forName("reflect.Student");
        //获取指定方法
        Method getAge = student.getMethod("getAgeChange");
        System.out.println(getAge);
        //获取所有字段
        Field[] declaredFields = student.getDeclaredFields();
        for (Field field:declaredFields){
            System.out.println(field);
        }
        Field name = student.getDeclaredField("name");
        Constructor<?>[] declaredConstructors = student.getDeclaredConstructors();

        System.out.println(declaredConstructors);



//        Student student1 = student.newInstance();
    }
}
