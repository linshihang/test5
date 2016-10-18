package test5;

import javafx.concurrent.Task;
import org.junit.Test;
import sun.org.mozilla.javascript.internal.Synchronizer;

import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.concurrent.*;

/**
 * Created by ASUS on 2016/4/12.
 */
public class ThreadTest5 {


    public enum EnumTest1{
        SMALL,MILLID,LARGE
    }

    private static int number;
    private static boolean ready;
    public volatile int a;
    private Map<String,String> map = new HashMap();
    private String []pro = new String[]{"aa","bb"};
    private final ThreadTest4 threadTest4 = new ThreadTest4();
    private Hashtable<String,String> table = new Hashtable<String, String>();
    private List<String> s = Collections.synchronizedList(new LinkedList<String>())  ;
    private List list  = new ArrayList<String>();
    private final RunnableTest1 r;


    public ThreadTest5(List list) {
        this.list = list;
        r = new RunnableTest1();
    }

    public String[] getPro() {

        return pro;
    }

    private static class ReadThread implements Runnable{

        public void run(){
            while(!ready){
                Thread.yield();
                System.out.println(1);
            }
            System.out.println(number);
        }
    }

    public static void main(String []args){
        Thread thread = new Thread(new ReadThread());
        thread.start();
        number=42;
        System.out.println("aa");
        ready = true;
        System.out.println("bb");
    }

    @Test
    public void test1(){
        String[]p = getPro();
        p[1] = "cc";
        String s ="";
        Test1 t = new Test1();
        System.out.println(getPro()[1]);
        threadTest4.s =3;
    }

    @Test
    public void test2(){
        //ConcurrentHashMap<String,String> map = new ConcurrentHashMap<String, String>();
        HashMap<String,String> map1 = new HashMap<String, String>();
        map1.put("1","1");
        map1.put("2", "2");
        for(Map.Entry<String,String> entry: map1.entrySet()){
            if(entry.getKey().equals("1")){
                map1.remove(entry);
            }
        }
        System.out.println(map1);
    }

    @Test
    public void test3() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("1","1");
        for(int i=0;i<1000000;i++){
            map.put(Integer.toString(i),Integer.toString(i));
        }
        for(int i=0;i<10000;i++){
            map.put(Integer.toString(i),Integer.toString(i));
        }
    }

    @Test
    public void test4() throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                File f= new File("");
                try {
                    //InputStream inputStream = new FileInputStream(new File("E:\\VGDownloads\\test1.txt"));
                    FileWriter writer = new FileWriter(new File("E:\\VGDownloads\\test1.txt"));
                    for(int i=0;i<10000;i++){
                        writer.write(i + "\n");
                    }
                    writer.flush();
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                Thread.interrupted();
                System.out.println("1");
                //System.exit(1);
            }
        },"thread1");

        t1.start();
        //System.out.println(t1.getName());
        t1.join();
        //test5();
        System.out.println(2);
    }

    public void test5(){
        System.exit(1);
    }

    @Test
    public void test6() throws InterruptedException {
        RunnableTest1 runnableTest1 = new RunnableTest1();
        Thread thread1 = new Thread(runnableTest1);
        Thread thread2 = new Thread(runnableTest1);
        Thread thread3 = new Thread(runnableTest1);
        thread1.start();
        thread2.start();
        thread3.start();
        thread1.join();
        thread2.join();
        thread3.join();

    }

    @Test
    public void test7(){
        EnumTest1 enumTest = EnumTest1.LARGE;
        System.out.println(enumTest.ordinal());
    }

    @Test
    public void test8(){
        Set<String> set = new HashSet();
        //BlockingDeque<String> queue = (BlockingDeque<String>) new ArrayBlockingQueue(5);
        Vector<Integer> vector = new Vector<Integer>();
        Hashtable hashtable = new Hashtable();

        /*Map<String, String> map = new HashMap<String, String>();
        map.put("1","1");
        map.put("2","2");
        for(Map.Entry<String,String> entry: map.entrySet()){
            //map.put("3","3");
            map.remove("1");
        }*/

        /*List<String> list = new LinkedList<String>();
        list.add("1");
        list.add("2");
        for(String s : list){
            list.add("3");
        }*/
        System.out.println(Runtime.getRuntime().availableProcessors());
        //ThreadPoolExecutor
        try {
            RunnableTest1.main(new String[]{"aa"});
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
