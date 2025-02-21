public class rectangle {
    public static void main(String[] args) {
        int a=4;
        for(int i=1;i<=a;i++){
            for(int j=1;j<=a;j++){
                if(j==1 ||j==4 ||i==1||i==4){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    
    }
    
}
