public class one_zero_rectangle {
    public static void main(String[] args) {
        int a=4;
        for(int i=1;i<=a;i++){
            for(int j=1;j<=a;j++){
                if(((i==1)&&(j==1))||((i==2)&&(j==2))||((i==3)&&(j==3))||((i==4)&&(j==4))){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    
}
