package rtti;

import java.util.List;

/**
 * Created by ASUS on 2016/7/3.
 */
public class RttiTest1 {
    public static void  main(String[] args){
        try{
           //Candy candy =  new Dog();

           Class cc= Class.forName("rtti.Candy");
            //Class c= rtti.Candy.class;
            System.out.println(cc.getName());
            Candy candy =  new Candy();
            //System.out.println(cc.getName()+"\t"+cc.getSimpleName()+cc.getCanonicalName()+" name");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Candy not found");
        }

        new King();
        try {
            System.out.println(1);
            System.out.println(Class.forName("rtti.King"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void test1(List<? extends Candy> list){

    }
}

class Candy{
    static{
        System.out.println("Candy create");}
}

class King{
    static {
        System.out.println("King");
    }
}

class Dog extends Candy{

}
