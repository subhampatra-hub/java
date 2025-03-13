public class SmallestNum {
    public static void main(String[] args){
        int a=34,b=24,c=13;
        System.out.println("The three number is:\n"+a+"\n"+b+"\n"+c);
        if((a<b) && (a<c)){
            System.out.println(a+" "+" is smallest.");
        }
        else if((b<a) && (b<c)){
            System.out.println(b+" "+"is smallest.");

        }
        else{
            System.out.println(c+" "+"is smallest.");
        }
    }
    
}
