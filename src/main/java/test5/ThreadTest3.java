package test5;

/**
 * Created by ASUS on 2016/4/10.
 */
public class ThreadTest3 {
    public static void main(String[] args) throws InterruptedException {
        final TestChild t = new TestChild();

        new Thread(new Runnable() {
            @Override
            public void run() {
                t.doSomething();
            }
        }).start();
        Thread.sleep(100);
        t.doSomethingElse();
    }

    public synchronized void doSomething() {
        System.out.println("something sleepy!");
        try {
            Thread.sleep(1000);
            System.out.println("woke up!");
            System.out.println(this);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static class TestChild extends ThreadTest3 {
        public void doSomething() {
            super.doSomething();
        }

        public synchronized void doSomethingElse() {
            System.out.println(this);
            System.out.println("something else");
        }
    }
}