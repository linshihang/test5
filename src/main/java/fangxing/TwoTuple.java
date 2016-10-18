package fangxing;

import org.junit.Test;

import java.util.*;

/**
 * Created by ASUS on 2016/7/4.
 */
public class TwoTuple<A,B> {
    public  A first;
    public  B second;



    public TwoTuple(){

    }
    public String toString(){
        return first+"  "+second;
    }


    public static void main(String[] args) {
        TwoTuple<String, Integer> twoTuple = new TwoTuple<String, Integer>();
        System.out.println(twoTuple.toString());
        Map<String,String> map = new HashMap<String,String>();
        List ls = new ArrayList<String>();
    }

    @Test
    public void test2(){
        int[] a = new int[1];
        a[0] = 1;
        int[] b =a.clone();
        b[0]=2;
        int[][] c = new int[10][];
        System.out.println(a[0]);
        List list = Arrays.asList(a);

    }
}
