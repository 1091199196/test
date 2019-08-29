import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) throws Exception {
        Sing sing = new Handler();
        InvocationHandler handler = new InHandler(sing);
        Sing creat = (Sing) ((InHandler) handler).creat();
        creat.sing();
    }
}
