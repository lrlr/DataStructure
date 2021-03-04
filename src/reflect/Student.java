package reflect;

/**
 * @author lirui
 * @ClassName:
 * @Description:
 * @date 2019/7/2 9:51
 */
public class Student {
    private String name;
    private int age;
    private String addr;
    public Student(){

    }
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void change(){
        System.out.println(name);
    }
    public int getAgeChange(){
        System.out.println(age);
        return age;
    }
}
