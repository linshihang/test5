package test5;

import org.junit.Test;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by ASUS on 2016/4/21.
 */
public class DeadLock implements Runnable {

    int a=0;
    Class1 c1 = new Class1();

    public void run() {

        System.out.println(a);
        if(a==0){
            a++;
            try {
                c1.test1();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }else{

            try {
                c1.test2();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    class Class1 {
        Object obj1 = new Object();
        Object obj2 = new Object();

        public void test1() throws InterruptedException {
            synchronized (obj1) {
                System.out.println("test1");
                //Thread.sleep(20000);

                test2();

            }
        }

        public void test2() throws InterruptedException {
            synchronized (obj2) {
                System.out.println("test2");
                //Thread.sleep(2000);

                test1();

            }
        }
    }

    @Test
    public void test1(){
        DeadLock deadLock = new DeadLock();
        Thread thread1 = new Thread(deadLock);
        Thread thread2 = new Thread(deadLock);

        thread1.start();

        deadLock.a++;
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
