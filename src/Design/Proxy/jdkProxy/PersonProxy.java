package Design.Proxy.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author lirui
 * @ClassName:
 * @Description:
 * @date 2019/4/18 9:25
 */
public class PersonProxy implements InvocationHandler {
     private Object object;
    public Object newProxy(Object targetObject){
        this.object=targetObject;
        Object o = Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), this);
            return o;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object invoke = method.invoke(object, args);
        change();
        return invoke;
    }
    public void change(){
        System.out.println("工作也要适当休息");
    }
}
