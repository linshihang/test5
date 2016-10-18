/*
import java.util.*;

public class Main
{
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String str = cin.nextLine();
        Main m = new Main();
        System.out.println(m.strProcess(str));;
    }
    public int strProcess(String str){
        char[] c = str.toCharArray();
        for(int i=c.length-1,j=c.length-1;i>=0&&j>=0;j--){
            while(c[i]!='*'&&i>0){
                i--;
            }
            while(c[j]=='*'&&j>0){
                j--;
            }
            if(i>j) {
                char c1 = c[i];
                c[i] = c[j];
                c[j] = c1;
            }
        }
        for(int i=0;i<c.length;i++){
            if(c[i]!='*'){
                return i;
            }
        }
        return 0;
    }
}*/


/*
import java.util.*;

public class Main
{
    public static void main(String args[])
    {
        Scanner cin = new Scanner(System.in);
        int n;
        Main m = new Main();
        while(cin.hasNextInt())
        {
            n = cin.nextInt();
            for(int i=0;i<n;i++){
            System.out.println(m.fanic(cin.nextInt()));
        }
        }
    }

    public int fanic(int n){
        if(n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        if(n==3){
            return 2;
        }
        return fanic(n-1)+fanic(n-2);
    }
}*/
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main m = new Main();
        while(sc.hasNext()) {
            int num = sc.nextInt();
            for(int i=0; i<num; i++) {
                System.out.println(m.Fan(sc.nextInt()));
            }
        }

    }
    public int Fan(int n) {
        if(n == 1) return 0;
        if(n == 2) return 1;
        if(n == 3) return 2;
        return Fan(n-1)+Fan(n-2);
    }
}*/

/*

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[] result = new int[n];
        for(int i=0;i<n;i++)
        {
            int m=scanner.nextInt();
            int a[]=new int[m];
            int b[]=new int[m-1];
           */
/* List<Integer> list1 = new LinkedList<Integer>();
            List<Integer> list2 = new LinkedList<Integer>();*//*

            for(int j=0;j<m;j++)
            {
                a[j]=scanner.nextInt();
                //list1.add(scanner.nextInt());
            }
            for(int j=0;j<m-1;j++)
            {
                b[j]=scanner.nextInt();
                //list2.add(scanner.nextInt());
            }

            for(int j=0;j<m;j++){
                boolean flag =false;
                for(int k=0;k<m-1;k++){
                    if(a[j]==b[k]){
                        flag = true;
                    }
                }
                if(flag==false){
                    result[i]=a[j];
                    break;
                }
            }
            */
/*for(int j=0;j<m;j++){
                if(!list2.contains(list1.get(j))){
                    //System.out.println(list1.get(j));
                    result[i]= list1.get(j);
                }
            }*//*

        }
        for(int i=0;i<n;i++){
            System.out.println(result[i]);
        }

    }

}

*/
/*

import java.util.*;

public class Main
{
    public static void main(String args[])
    {
        Scanner cin = new Scanner(System.in);
        int n,a,b,x;

        n=cin.nextInt();
        a=cin.nextInt();
        b=cin.nextInt();
        x=cin.nextInt();
        int []result=new int[b-a+1];
        int []result1;

        for(int j=0;j<b-a+1;j++){
            result[j]=a+j;
        }
        result1 = result;
        int i=2;
        while(i<n+1)
        {

            result = new int[result.length*(b-a+1)];
            int m=0;
            for(int j=0;j<b-a+1;j++){
                for(int k=0;k<result1.length;k++){
                    result[m] = result1[k]+a+j;
                    m++;
                }
            }
            result1=result;
            i++;
        }
        double count=0;
        for(int j=0;j<result.length;j++){
            if(result[j]==x){
                count++;
            }
        }
        System.out.println();
        double r = count/result.length;
        System.out.println(String.format("%.4f",r));
    }


}*/
/*

import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int []a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = cin.nextInt();
        }
        int m = cin.nextInt();
        int b[] = new int[m];
        for(int i=0;i<m;i++){
            b[i] = cin.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int count=0;
        int maxCount = 0;
        int index=0;
        for(int i=0,j=0;i<n&&j<m;){
            if(a[i]>a[j]){
                count++;
                i++;
                if(count>maxCount){
                    maxCount = count;
                    index = a[i];
                }
            }else if(a[i]==a[j]){
                i++;
                j++;
            }else{
                count--;
                j++;
            }
        }
        int countA=0;
        int countB=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<index){
                countA+=2;
            }else{
                countA+=3;
            }
        }
        for(int i=0;i<b.length;i++){
            if(b[i]<index){
                countB+=2;
            }else{
                countB+=3;
            }
        }
        System.out.println(countA-countB);
    }

}*/
/*
import test5.DeadLock;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        */
/*Scanner cin = new Scanner(System.in);

        Main m = new Main();
        int n = cin.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = cin.nextInt();
        }
        int tag1=n-1;
        int tag2=n-1;
        for(int i=0;i<n-1;i++){
            if(a[i+1]<a[i]){
                tag1=i;
                tag2=n-1;
                for(int j=i+1;j<n-1;j++){
                    if(a[j]>a[i]){
                        tag2=j;
                        break;
                    }
                }
                break;
            }
        }
        boolean flag1=true,flag2=true;
        for(int i=tag1;i<tag2-1;i++){
            if(a[i+1]>a[i]){
                flag1=false;
            }
        }
        for(int i=tag2+1;i<n-1;i++){
            if(a[i+1]<a[i]){
                flag2=false;
            }
        }
        if(flag1&&flag2&&(a[tag1]<a[tag2])&&(tag1==0||a[tag1-1]<a[tag2-1])){
            System.out.println("yes");;
        }else{
            System.out.println("no");
        }*//*

        DeadLock d = new DeadLock();
        List<DeadLock> list = new LinkedList<DeadLock>();

        while(true){
            list.add(d);
            System.out.println(list.size());
        }
    }

}*/
/*
import java.util.*;

public class Main
{
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);


        int n = cin.nextInt();
        int score[][]= new int[n][4];
        for(int i=0;i<n;i++){

            for(int j=0;j<4;j++){
                score[i][j]=cin.nextInt();
            }

        }
        for(int i=0;i<n;i++){
            int s=score[i][0]+score[i][1]+score[i][2]+score[i][3];
            if(score[i][0]>=60&&score[i][1]>=60&&score[i][2]>=90&&score[i][3]>=90&&s>=350){
                System.out.println("Gongfei");
            }else if(score[i][0]>=60&&score[i][1]>=60&&score[i][2]>=90&&score[i][3]>=90&&s<350&&s>=310){
                System.out.println("Zifei");
            }else{
                System.out.println("Fail");
            }
        }

    }

}*/

/*

import java.util.*;

public class Main
{
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        int K = cin.nextInt();//推荐服装数目
        int I = cin.nextInt();//服装数
        int U = cin.nextInt();//玩家数
        int [][]s = new int[U][I];
        double [][]result = new double[U][K];
        for(int i=0;i<U;i++){
            for(int j=0;j<I;j++){
                s[i][j]=cin.nextInt();
            }
        }
        Main main = new Main();
        for(int i=0;i<U;i++){
            double[][] score=new double[U][1];
            double[] score1 = new double[U];
            for(int j=0;j<U;j++){
                if(i==j){
                    continue;
                }
                else{
                    double temp=main.calcute(s[i],s[j]);
                    score[j][0]=temp;
                    score1[j]=temp;
                }
            }
            Arrays.sort(score1);
            for(int j=0;j<U;j++){
                if(score[j][0]<score1[U-K]){
                    score[j][0]=0;
                }
            }
            int[] player = new int[K];
            int k=0;
            for(int j=0;j<U;j++){
                if(score[j][0]>0){
                    player[k]=j;
                    k++;
                }
            }
            Arrays.sort(player);
            */
/*for(int j=0;j<K;j++){
                System.out.println(player[j]);
            }*//*

            int item[] = new int[K];
            for(int j=0;j<I;j++) {
                if(player[])
            }
        }

    }

    public double calcute(int[] p1,int[] p2){
        double s1=0,s2=0,s3=0;
        for(int i=0;i<p1.length;i++){
            s1=s1+p1[i]*p2[i];
            s2=s2+p1[i]*p1[i];
            s3=s3+p2[i]*p2[i];
        }
        double result = s1/(Math.sqrt(s2)*Math.sqrt(s3));
        return result;
    }



}*/


/*

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        Main main = new Main();
        main.change(m, n);

    }

    public void change(int num,int n) {
        List<Integer> list = new LinkedList<Integer>();
        while (num != 0) {
            int remainder = num % n;
            num = num / n;
            list.add(remainder);
        }
        for(int i=list.size()-1;i>=0;i--){
            if(list.get(i)>=10){
                char c= (char) ('A'+(list.get(i)-10));
                System.out.println(c);
            }else {
                System.out.print(list.get(i));
            }
        }

    }
}
*/



import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sc.nextInt();
        List<Integer> list = new LinkedList<Integer>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        Main main = new Main();
        System.out.println(main.count(list,sum,0));
    }

    public int count(List<Integer> list,int sum,int cou){
        int tempsum=sum;
        if(sum==0){
            return 1;
        }
        if(list.size()==0||list.get(0)>sum||sum<=0){
            return cou;
        }

        cou = cou+count(list.subList(1,list.size()),tempsum,cou);
        cou = cou+count(list.subList(1,list.size()),tempsum-list.get(0),cou);


        return cou;
    }
/*    public int count(int[] arr,int sum){
        int count=0;
        Arrays.sort(arr);
        int begin=0;
        int end=0;
        int sum1=arr[0];
        while(end<arr.length&&begin<=end){
            //sum1+=arr[end];
            if(sum1==sum){
                count++;
                sum1-=arr[begin];
                begin++;
                end++;
                sum+=arr[end];

            }else if(sum1<sum){
                end++;
                if(end<arr.length) {
                    sum1 += arr[end];
                }
            }else{
                sum1-=arr[begin];
                begin++;
            }
        }
        return count;
    }*/
}

