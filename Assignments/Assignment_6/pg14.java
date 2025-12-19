import java.util.Scanner;
import java.util.Arrays;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(findFirstNonRepeating(arr));

    }
    public static int findFirstNonRepeating(int[] arr) {
        int minIndex = -1;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = 0;
                    arr[j] = 0; 
                }
            }
        }
        for(int e: arr){
            if(e != 0){
                return e;
            }
        }

        return -1;  
    }
}