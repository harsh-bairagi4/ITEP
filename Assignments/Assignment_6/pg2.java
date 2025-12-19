import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < size; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("\nThe minimum value is: "+ min);
        System.out.println("The maximum value is: "+ max);
    }
}