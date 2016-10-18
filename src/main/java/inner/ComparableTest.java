package inner;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by ASUS on 2016/7/6.
 */
public class ComparableTest implements Comparable<ComparableTest> {
    public ComparableTest(int t){
        tag = t;
    }
    int tag;

    public int compareTo(ComparableTest comparableTest) {
        return (tag>comparableTest.tag)?1:(tag==comparableTest.tag?0:-1);
    }

    public static void main(String[]args){
        ComparableTest[] comparableTest1 = {new ComparableTest(1),new ComparableTest(3),new ComparableTest(2)};
        Arrays.sort(comparableTest1);
        for(ComparableTest c:comparableTest1){
            System.out.println(c.tag);
        }
        Comparable<String> comparable = new Comparable<String>() {

            public int compareTo(String o) {
                return 0;
            }
        };
        List<String> list = new ArrayList<String>();

    }

}
