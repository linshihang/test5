package test5;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ASUS on 2016/7/21.
 */
public class Test2 {
    static{
        int x = 0;
    }
    static int x;
    public static void main(String[]args) throws  Exception{
        //digui("3224","");
        for(int i=0;i<10;i++)

        System.out.println("");

    }

    public static void digui(String s,String pre){
        String news="";
        for(int i = 0;i<s.length();i++){
            if(s.substring(0,i).contains(s.substring(i,i+1))){
                continue;
            }
            if(s.length()>1){

                digui(s.substring(0,i)+s.substring(i+1),pre+s.charAt(i));
            }else{
                System.out.println(pre+s);
            }
        }

    }
}
