package thread;

import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;


/**
 * Created by ASUS on 2016/7/11.
 */
public class ThreadTest1 implements Runnable {
    private int count = 100;
    private boolean flag = true;
    private final int content = count;
    public void run(){
        while(!Thread.interrupted()){
            System.out.println(count--);
        }
    }

    public static void main(String[]args) {
        ExecutorService exe = Executors.newCachedThreadPool();
        ThreadTest1 threadTest1 =  new ThreadTest1();
        /*for(int i=0;i<5;i++) {
            exe.execute(threadTest1);

        }
        exe.shutdown();*/
        System.out.println("end");
        Thread thread = new Thread(threadTest1);
        thread.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();
    }
}
