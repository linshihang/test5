package test5;

import org.junit.Test;

/**
 * Created by ASUS on 2016/4/22.
 */
public class WaitAndNotify implements Runnable {

    int index = 0;
    public void run() {
        if(index==0){
            index++;
            w();
        }else {
            n();
        }
    }

    public void w(){
        try {
            synchronized (this) {
                System.out.println("wait");
                wait();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void n(){
        synchronized (this) {
            notify();
        }
        System.out.println("notify");
    }

    @Test
    public void test1() throws InterruptedException {
        WaitAndNotify waitAndNotify = new WaitAndNotify();
        Thread thread1 = new Thread(waitAndNotify);
        Thread thread2 = new Thread(waitAndNotify);
        thread1.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.start();
        thread1.join();
        thread2.join();
    }
}
