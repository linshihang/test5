package collections;

import java.util.*;

/**
 * Created by ASUS on 2016/7/6.
 */
public class CollectionTest1 {
    public static void main(String[]args) {
       /* int[] a = {1,2};
        List list = Arrays.asList(a);

        list.add(3);
        Object o = new Object();*/

        /*Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(2);
        queue.add(1);
        queue.add(3);
        while(queue.size()>0){
            System.out.println(queue.remove());
        }*/
        Map<Integer, String> treeMap = new TreeMap<Integer, String>();
        treeMap.put(2,"b");
        treeMap.put(1,"a");
        treeMap.put(3,"c");
        for(Map.Entry<Integer,String> entry:treeMap.entrySet()){
            System.out.println(entry.getKey());
        }

    }
}
