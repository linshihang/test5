package fangxing;

/**
 * Created by ASUS on 2016/7/4.
 */
public class Test1<T> {
    private T demo;
    public void test(T d){
        demo = d;
    }

    public static void main(String[]args){
        Test1<String> t = new Test1<String>();
        t.test("s");
        System.out.println(t.demo);
    }
}
