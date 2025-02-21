import java.util.*;
public class printMultiiplicationNum {
    public static int  multiplicationNum(int a,int b){
        int mul=a*b;
        return mul;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number  :");
        int y=sc.nextInt();
        int z=sc.nextInt();
        int multi=multiplicationNum(y,z);
        System.out.println("The multiplication of two number is :"+multi);



    }

}
