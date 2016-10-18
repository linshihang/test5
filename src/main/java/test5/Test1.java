package test5;

/**
 * Created by ASUS on 2016/4/11.
 */
public class Test1 {
    public int a = 0;
    public int b=10;

    Test1(){
        this(2);
    }

    Test1(int a){

    }
    public   void printA(Object obj){
        synchronized(obj) {
            a++;
            System.out.println(a);
        }
    }

    public  void printB(Object obj){
        synchronized(obj) {
            b++;
            System.out.println("b:" + b);
            while (true) {

            }
        }
    }


}
