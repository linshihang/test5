package test5;


import javafx.concurrent.Task;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by ASUS on 2016/5/30.
 */
public class ExecutorTest {
    public static void main(String args[]) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10,10,5000L, TimeUnit.MICROSECONDS,new LinkedBlockingDeque<Runnable>());
        ThreadTest4[] task = new ThreadTest4[100];
        for (int i=0;i<100;i++) {
            task[i] = new ThreadTest4();
            threadPoolExecutor.execute(task[i]);
        }
        threadPoolExecutor.shutdown();

    }
}
