package gc;

/**
 * Created by ASUS on 2016/7/31.
 */
public class GcTest1 {

    public static void main(String[]args){
        Test2 t = new Test2();
        t.sout();
        System.gc();
        t.stou2();
        while(true){
            System.out.println(1);
        }

    }
}

class Test2{
    int i=0;
    public void sout(){

        System.out.println(i);
        try {
            finalize();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public void stou2(){
        System.out.println(2);
    }
}