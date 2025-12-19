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
        for(int i = 0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nEnter which largest element you want: ");
        int largest = sc.nextInt();
        System.out.println("Enter which smallest element you want: ");
        int smallest = sc.nextInt();
        
        for(int i = 0; i < size - 1; i++){
            for(int j = i+1; j < size; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        System.out.println("The largest element is: " + arr[(size - largest)]);
        System.out.println("The smallest element is: " + arr[(smallest - 1)]);
    }
}