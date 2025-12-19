import java.util.Scanner;
import java.util.Arrays;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of array: ");
        for(int i =0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
       rotate(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void rotate(int arr[]){
         if (arr.length <= 1) {
            return; 
        }
        int temp = arr[arr.length - 1];
         for(int i = arr.length - 1; i > 0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }
}