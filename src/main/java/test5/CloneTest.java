package test5;

/**
 * Created by ASUS on 2016/4/21.
 */
public class CloneTest implements Cloneable {
    public void clone1(){
        try {
            super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
