public class checkevenodd {
    public static void main(String[] args) {
        int num=324;
        System.out.println("The entired number is: "+num);
        
        if(num%2==0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
        if(num%2==0 &&num<=-2){
            System.out.println("The number is Negative even number ");
        }
        else if(num%2==0 &&num>=2){
            System.out.println("The number is positive even number ");

        }
        else if(num%2!=0 && num<=-1){
            System.out.println("The number is negative odd");
        }
        else if(num%2!=0 && num>=1){
            System.out.println("The number is +ve odd ");

        }
        else{
            System.out.println("Zero is neither positive nor negative number");
        }    
    }
    
}
