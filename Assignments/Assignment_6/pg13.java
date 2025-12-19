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
        System.out.println(findFirstRepeating(arr));

    }
    public static int findFirstRepeating(int[] arr) {
        int minIndex = -1;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    minIndex = i;
                    return arr[minIndex];  
                }
            }
        }

        return -1;  
    }
}