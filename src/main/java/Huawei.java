import java.util.Scanner;

/**
 * Created by ASUS on 2016/8/11.
 */
public class Huawei {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int a;
        while (cin.hasNext()){
            int flag = 1;
            a = cin.nextInt();
            String s = String.valueOf(a);
            for(int i=0;i<s.length()/2+1;i++){
                if(s.charAt(i) != s.charAt(s.length()-i-1)){
                    flag=0;
                }
            }
            System.out.println(flag);
        }

    }
}
