import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class InHandler implements InvocationHandler {
    private Object realfun;

    public InHandler(Object realfun) {
        this.realfun = realfun;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("执行之前");

        Object invoke = method.invoke(realfun, args);

        System.out.println("执行之后");
        return invoke;
    }

    public Object creat() {
        return Proxy.newProxyInstance(InHandler.class.getClassLoader(), realfun.getClass().getInterfaces(), new InHandler(realfun));
    }
}
