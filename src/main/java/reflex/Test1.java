package reflex;

/**
 * Created by ASUS on 2016/7/27.
 */
public class Test1 {
    /*static{
        System.out.println("Test1");
    }*/
    public Test1(String s){

    }
    public String s="aa";
    public String s1 ="bb";
    public void prints(){
        System.out.println(s);
    }
    public void sets(String... str){
        s = str[0];
    }
    public void sets(String str){
        s = str;
    }
}
