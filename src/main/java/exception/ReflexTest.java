package exception;

import java.lang.reflect.Method;

/**
 * Created by ASUS on 2016/7/4.
 */
public class ReflexTest {
    String text;
    public ReflexTest(String s){

    }
    public void test1(String s){

    }

    public static void main(String[]args){
        try {
            Class c = Class.forName("exception.ReflexTest");
            Method[] methods = c.getMethods();
            System.out.println(methods[1].getParameterAnnotations());

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
