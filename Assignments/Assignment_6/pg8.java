import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int e : arr){
            System.out.print(e + " ");
        }
        
        System.out.println("\n" + Arrays.toString(change(arr)));
    }

    public static int[] change(int arr[]){

        int n = arr.length;

        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();

        
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                positive.add(arr[i]);
            } else {
                negative.add(arr[i]);
            }
        }

        int index = 0;
        for (int num : positive) {
            arr[index++] = num;
        }
        for (int num : negative) {
            arr[index++] = num;
        }

       
        return arr;
    }
        
    
}