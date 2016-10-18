package test5;

/**
 * Created by ASUS on 2016/4/8.
 */
public class ThreadTest2 {

    private static ThreadTest2 instance = null;
    private ThreadTest2(){

    }

    public static ThreadTest2 getInstance(){
        if(instance == null){
            synchronized (ThreadTest2.class){
                if(instance ==null) {
                    instance = new ThreadTest2();
                }
            }
        }
        return instance;
    }
}
