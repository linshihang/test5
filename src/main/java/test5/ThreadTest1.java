package test5;

import org.junit.Test;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by ASUS on 2016/4/8.
 */
public class ThreadTest1 implements Runnable{


    private boolean done = false;
    int index = 0;
    public void run() {
        if(index==0){
            index++;
            while(!done){
                System.out.println("done");
            }
        }else{
            done = true;
        }
    }

    public static void main(String []args) throws InterruptedException {
        ThreadTest1 threadTest1 = new ThreadTest1();
        Thread thread1 = new Thread(threadTest1);
        Thread thread2 = new Thread(threadTest1);
        thread1.start();
        Thread.sleep(1000);
        thread2.start();
        thread1.join();
        thread2.join();

    }

    @Test
    public void test1(){
        AtomicInteger a1 = new AtomicInteger(2);
        a1.addAndGet(2);
        System.out.println(a1.get());

    }
}
