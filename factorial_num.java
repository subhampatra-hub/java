import java.util.Scanner;
public class factorial_num {
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        System.out.println("Enter a number which you want the factorial of a number  :");
        int a=x.nextInt();
        int factorial=1;
        for(int i=1;i<=a;i++){
            factorial*=i;

        }
        System.out.println("The factorial of a number is :"+factorial);

        

    }
    
}
