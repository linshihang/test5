package test5;

/**
 * Created by ASUS on 2016/4/8.
 */
public class RunnableTest1 implements Runnable {

    private Object obj;
    private int index =0;
    Test1 test1 = new Test1();
    public void run() {
        //while (number < 500) {
            /*try {
                //Thread.sleep(15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
            //System.out.println(1);
        /*System.out.println(obj);
            test1.printA(obj);
            test1.printB(obj);*/
        System.out.println(Thread.currentThread());
        index++;
        System.out.println(index);

        //}
    }

    public static void main(String []args) throws InterruptedException {
        RunnableTest1 runnableTest1 = new RunnableTest1();

        Thread thread1 = new Thread(runnableTest1);

        runnableTest1.obj = new Object();
        thread1.start();
        //Thread.sleep(1000);
        Thread thread2 = new Thread(runnableTest1);
        runnableTest1.obj = new ThreadTest3();
        thread2.start();
        //Thread.sleep(1000);
        Thread thread3 = new Thread(runnableTest1);
        runnableTest1.obj = new ThreadTest4();
        thread3.start();

    }
}

