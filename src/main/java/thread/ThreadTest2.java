package thread;

import java.util.Date;

/**
 * Created by ASUS on 2016/7/18.
 */
public class ThreadTest2{
    public synchronized void t1(){
        System.out.println(1);
        t2();
    }

    public synchronized void t2(){
        System.out.println(2);
        t1();
    }

    public static void main(String[]args){
        /*Test test = new Test();
        new Thread(test).start();
        new Thread(test).start();
        Date d = new Date();*/
        System.out.println("aaaa");

        if(true){
            return;
        }
        System.out.println("bbbb");

    }
}

class Test implements Runnable{
    private ThreadTest2 threadTest2 = new ThreadTest2();
    boolean flag = true;
    public void run(){
        while(flag) {
            threadTest2.t1();
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            threadTest2.t2();
        }
    }
}