import java.util.Scanner;
 class ArrayOperations {
    private int[] arr;
    private int size;
    public ArrayOperations(int maxSize) {
        arr = new int[maxSize];
        size = 0;
    }
    // Insert Element
    public void insert(int pos, int element) {
        if (pos < 0 || pos > size) {
            System.out.println("Invalid position for insertion.");
            return;
        }
        for (int i = size; i > pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos] = element;
        size++;
        System.out.println("Inserted successfully!");
    }
    public void delete(int pos) {
        if (pos < 0 || pos >= size) {
            System.out.println("Invalid position for deletion.");
            return;
        }
        for (int i = pos; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
        System.out.println("Deleted successfully!");
    }
   public void display() {
        if (size == 0) {
            System.out.println("Array is empty.");
        } else {
         System.out.print("Array elements: ");
            for (int i = 0; i < size; i++) {
 System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

   public void fillArray(Scanner sc, int initialSize) {
        size = initialSize;
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
    }
 }
 public class Exp1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayOperations obj = new ArrayOperations(10);
        System.out.print("SIZE: ");
        int size = sc.nextInt();
        obj.fillArray(sc, size);
        obj.display();
        System.out.print("Enter position and element to insert: ");
        int posInsert = sc.nextInt();
        int element = sc.nextInt();
        obj.insert(posInsert, element);
        obj.display();
        System.out.print("Enter position to delete element: ");
        int posDelete = sc.nextInt();
        obj.delete(posDelete);
        obj.display();
        sc.close();
    }
 }
