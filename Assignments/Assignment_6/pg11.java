import java.util.Scanner;
import java.util.Arrays;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of array: ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target: ");
        int target = sc.nextInt();

        System.out.println(Arrays.toString(arr));
        System.out.println(count(arr, target));
    }
    public static int count(int arr[], int target){
        if()
        int count = 0;
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] + arr[j] == target){
                    count++;
                }
            }
        }
        return count;
    }
}