import java.util.*;
public class devidenum {
    public static int devideTwoNum(int a,int b){
        int devide=a/b;
        return devide;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number :");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int dev=devideTwoNum(x,y);
        System.out.println("Result="+dev);
    }
}
