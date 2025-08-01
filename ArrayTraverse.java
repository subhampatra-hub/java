public class ArrayTraverse {
    public void traverseArray(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" found in "+i+" index.");
        }
    }
    public static void main(String args[]){
        ArrayTraverse obj=new ArrayTraverse();
        int [] number={1,44,77,88,55,2,3,6,9};
        obj.traverseArray(number);
    }
    
}
