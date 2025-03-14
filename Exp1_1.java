import java.util.*;
import java.util.Arrays;

class ArrOpe{
    public int[] arr;
    public ArrOpe(int[] arr){
        this.arr=arr;
    }
    //1.SEARCH
    public void Search(int point){
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==point){
                System.out.println("Element"+point+"found the index"+i);
                found=true;
                break;
            }

        }
        if(!found)System.out.println("Element"+point+"not found.");

    }

    //2.SORT
    public void Sort(){
        Arrays.sort(arr);
        System.out.println("Sorted Array :"+Arrays.toString(arr));
    }

    //3.ADDITION

    public void Add(){
        int sum=0;
        for(int i:arr)sum+=i;
        System.out.println("Sum of array elements :"+sum);
    }

    //SUBSTRACTION

    public void Sub(){
        for (int i=0;i<arr.length-1;i++){
            int larger=Math.max(arr[i],arr[i+1]);
            int smaller=Math.min(arr[i],arr[i+1]);
            System.out.println("substraction between"+larger+"and"+smaller+"="+(larger-smaller));
        }
    }

    //5.AVARAGE

    public void Avg(){
        int sum=0;
        for(int i:arr)sum+=i;
        double average=(double)sum/arr.length;
        System.out.printf("Average of Array elements :%.2f%n",average);
    }

}
//main class for User input

public class Exp1_1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Size: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter"+size+"elements: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        ArrOpe obj=new  ArrOpe(arr);
        while (true) {
            System.out.println("*************************");
            System.out.println("Choose an operation: \n1.Search\n2.Sort\n3.Addition\n4.Substraction\n5.Average\n6.Exit");
            System.out.println("************************");
            System.out.print("CHOICE :");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                System.out.print("Enter Point: ");
                int point=sc.nextInt();
                obj.Search(point);
                break;
                case 2:
                obj.Sort();
                break;
                case 3:
                obj.Add();
                break;
                case 4:
                obj.Sub();
                break;
                case 5:
                obj.Avg();
                break;
                case 6:
                System.out.println("__________EXIT__________\n");
                // sc.close();
                // return;
                defult:
                System.out.println("INVALID CHOICE");
                sc.close();
                return;


            } 
            
        }

            
        
    }
}