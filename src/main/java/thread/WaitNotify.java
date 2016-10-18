package thread;

/**
 * Created by ASUS on 2016/7/18.
 */
public class WaitNotify {
    public static void main(String[] args) {
        Car car = new Car();
        new Thread(new Flex(car)).start();
        new Thread(new Buff(car)).start();
    }
}

class Car {
    public synchronized void flex() {
        System.out.println("flex");
        notifyAll();
        System.out.println(1);
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void buff() {
        System.out.println("buff");
        notifyAll();
        System.out.println(2);
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Flex implements Runnable {
    Car car;
    public Flex(Car c){
        car = c;
    }
    public void run() {
        //while (true) {
            car.flex();
            System.out.println("Flex Thread");
        //}
    }
}

class Buff implements Runnable {
    Car car;
    public Buff(Car c){
        car = c;
    }
    public void run() {
        //while (true) {
            car.buff();
            System.out.println("Buff Thread");
        //}
    }
}