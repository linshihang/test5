package reflex;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by ASUS on 2016/7/27.
 */
public class ReflexTest {
    public static void main(String[]args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        Object object = new Object();
        //Class c = Class.forName("reflex.Test1");
        Class c1 = reflex.Test1.class;
        //c1.newInstance();
        Field[] fields = c1.getFields();
        /*for(Field f:fields){
            System.out.println(f.getName());
        }*/
        Field field = c1.getDeclaredField("s1");
        //System.out.println(field);
        Method method = c1.getDeclaredMethod("sets", String.class);
        System.out.println(method);
        Constructor[] c2 =  c1.getDeclaredConstructors();
        Object t = c2[0].newInstance("");

        method.invoke(t,"gg");
        Method method1 = c1.getDeclaredMethod("prints");
        method1.invoke(t);
        fields[0].set(t, "hh");
        System.out.println(method1.invoke(t));;
        System.gc();

    }

    public void test() throws Throwable {
        finalize();
    }
}
