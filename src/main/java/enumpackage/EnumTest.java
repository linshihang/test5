package enumpackage;

import org.junit.Test;

/**
 * Created by ASUS on 2016/7/10.
 */
public class EnumTest {
    public static void main(String[]args){
        Animal animal;
        for(Animal s:Animal.values()){
            System.out.println(s.ordinal());


        }
    }

}


 enum Animal{
    DOG
    ,DUCK,CAT;
     private Animal(){

     }
}