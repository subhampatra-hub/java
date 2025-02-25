import java.util.Scanner;
public class factorialof_a_num {
    public static void main(String args[]){
        Scanner fac=new Scanner(System.in);
        System.out.println("Enter a number that you want the factorial of a  number  :");
        int a=fac.nextInt();
        int factt=1;
        if(a<=0){
            System.out.println("Please enter valid number, negetive number can't be calculate. ");
        }
        else{
            for(int i=1;i<=a;i++){
                
                factt*=i;
            }
            System.out.println("The factorial of a number is : "+factt);
        }
    }
    
}
