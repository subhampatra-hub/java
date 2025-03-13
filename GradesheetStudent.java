public class GradesheetStudent{
    public static void main(String[] args){
        
        int mark=98;
    ;
        if((mark<=100)&&(mark>=60)){
            System.out.println("Congratulation...You get Grade A");
        }
        else if((mark<=59)&&(mark>=40)){
            System.out.println("Congratulation...You get Grade B");
        
        }
        else if((mark<=39)&&(mark>=25)){
            System.out.println("Congratulation ...You get Grade C");

        }
        else if((mark>=1) && (mark<=24)){
            System.out.println("Sorry ...You are FAIL");
        }
        else{
            System.out.println("Please enter Positive integer under 100");
        }
    }
}