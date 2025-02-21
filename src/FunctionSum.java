
import java.util.*;
public class FunctionSum {
    public static int PrintSumTwoNum(int x, int y) {
        int sum = x + y;

        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr two number:-");
        int a=sc.nextInt();
        int b=sc.nextInt();

        int sum=PrintSumTwoNum(a,b);
        System.out.println("The sum of two number is :"+sum);
    }
}
