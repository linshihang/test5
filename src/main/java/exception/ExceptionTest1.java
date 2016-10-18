package exception;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.io.IOError;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by ASUS on 2016/7/2.
 */
public class ExceptionTest1 {
    public boolean test1(ArrayList list){
        try{
            list.add(1);
        }catch (IOError io){
            list.add(1);
        }catch (NullPointerException nu){
            nu.printStackTrace();
        }
        return true;
    }


    public static void stringTest(String s){
        s = s+"1";
    }
    public static void main(String []args){
        String s1 = "1";
        stringTest(s1);
        System.out.println(s1);
        Pattern p = Pattern.compile("");
        Matcher match = p.matcher("");

    }
}
