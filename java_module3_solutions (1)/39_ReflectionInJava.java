import java.lang.reflect.*;
public class ReflectionExample {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("java.util.Date");
        Method[] methods = cls.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println(m.getName());
        }
        Object date = cls.getConstructor().newInstance();
        Method toString = cls.getMethod("toString");
        System.out.println("Date: " + toString.invoke(date));
    }
}
