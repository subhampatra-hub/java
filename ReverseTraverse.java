public class ReverseTraverse {
    public void reverses(int arr[]){
        
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]+" found in "+i+" index.");

        }
    }
    public static void main(String args[]){
        int []number={41,52,63,74,85,9,6,7,2};
        ReverseTraverse obj=new ReverseTraverse();
        obj.reverses(number);
    }
    
}