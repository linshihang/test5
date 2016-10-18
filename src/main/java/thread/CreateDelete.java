package thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Created by ASUS on 2016/7/18.
 */
public class CreateDelete {
    public static void main(String[]args){
        BlockingQueue<Tusi> firstQueue = new LinkedBlockingDeque<Tusi>();
        BlockingQueue<Tusi> secondQueue = new LinkedBlockingDeque<Tusi>();
        BlockingQueue<Tusi> thirdQueue = new LinkedBlockingDeque<Tusi>();
        ExecutorService exe = Executors.newCachedThreadPool();
        exe.execute(new First(firstQueue));
        exe.execute(new Second(firstQueue,secondQueue));
        exe.execute(new Third(secondQueue,thirdQueue));
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        exe.shutdownNow();
    }
}


class Tusi{
    enum Status{FIRST,SECOND,THIRD};
    private Status status = Status.FIRST;
    private int count=0;
    public Tusi(int c){
        this.count = c;
    }
    public void second(){
        status = Status.SECOND;
    }
    public void third(){
        status = Status.THIRD;
    }
}

class First implements Runnable{
    private BlockingQueue<Tusi> firstQueue;
    int count=0;
    public First(BlockingQueue f){
        firstQueue = f;
    }
    public void run(){
        while(!Thread.interrupted()){
            Tusi tusi = new Tusi(count++);
            try {
                firstQueue.put(tusi);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("first: "+count);

        }
    }
}

class Second implements Runnable{
    private BlockingQueue<Tusi> firstQueue;
    private BlockingQueue<Tusi> secondQueue;
    private int count=0;
    public Second(BlockingQueue<Tusi> f,BlockingQueue<Tusi> s){
        firstQueue = f;
        secondQueue = s;
    }
    public void run(){
        while(!Thread.interrupted()){
            try {
                Tusi t = firstQueue.take();
                t.second();
                secondQueue.put(t);
                System.out.println("second: " + count++);
                //Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

class Third implements Runnable{
    private BlockingQueue<Tusi> thirdQueue;
    private BlockingQueue<Tusi> secondQueue;
    private int count=0;
    public Third(BlockingQueue<Tusi> s,BlockingQueue<Tusi> t){
        thirdQueue = t;
        secondQueue = s;
    }
    public void run(){
        while(!Thread.interrupted()){
            try {
                Tusi t = secondQueue.take();
                t.second();
                thirdQueue.put(t);
                System.out.println("third: " + count++);
               // Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}