package inner;

import java.util.*;

/**
 * Created by ASUS on 2016/5/21.
 */
public class InnerTest1 {

    public class Innerr{
        private int i=12;


        public void getI(){
            int a;
            i++;
            System.out.println(i);
        }
    }
    //String s = "aa";
    public AbstractTest1 test1(String s2, final String s3){
        final String s4 = "bb";
        Innerr innerr = new Innerr();
        return new AbstractTest1(s2) {
            @Override
            public void test1() {
                System.out.println(s4);
            }
        };

    }

    public static void main(String []args){
        /*InnerTest1 innerTest1 = new InnerTest1();
        AbstractTest1 abstractTest1 = innerTest1.test1("aa","bb");
        abstractTest1.test1();*/
        int[] array = new int[10];
        Arrays.sort(array);
        List list = new ArrayList();
        Iterator it = list.iterator();

        while(it.hasNext()){
            Object obj = it.next();

        }
        Innerr innerr = new InnerTest1().new Innerr();
        innerr.getI();
    }
}

