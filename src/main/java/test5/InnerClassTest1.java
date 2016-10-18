package test5;

/**
 * Created by ASUS on 2016/5/21.
 */
public class InnerClassTest1 {
    private static int a=1;
    private Inner1 inner;
    public void test1(){
        Inner1 inner1 = new Inner1();
        inner1.outprint();
    }
    class Inner1 {
        private void outprint(){
            System.out.println(a);
            test1();
        }
    }

    public static void main(String []args){

    }
}
