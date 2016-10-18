package test5;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by ASUS on 2016/4/11.
 */
public class ThreadTest4 implements Runnable{
    private static final List<String> list = new LinkedList<String>();
    private static final Map<String,String> map = new HashMap<String, String>();
    public static volatile int s =0;

    public void run(){
        /*if(s==0){
            s++;
            w();

        }else{
            //n();
        }*/
        synchronized (this) {
            System.out.println(s);
            s++;
        }
    }


    public synchronized void w(){
        try {
            System.out.println("wait");
            wait(1000);
            System.out.println();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void n(){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notify();
        System.out.println("notify");

    }

    public static void main(String []args) throws InterruptedException {
        ThreadTest4 threadTest4 = new ThreadTest4();
        Thread thread1 = new Thread(threadTest4);
        Thread thread2 = new Thread(threadTest4);
        thread1.start();
        Thread.sleep(1000);
        thread2.start();
        thread1.join();
        thread2.join();
    }
}
