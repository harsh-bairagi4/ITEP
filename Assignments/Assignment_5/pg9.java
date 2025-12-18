
import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the elements: ");
        for(int i = 0;  i < size; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");

        }
        System.out.println("\nEnter the position from which element have to be deleted: ");
        int position = sc.nextInt();
        if(position > size){
            System.out.println("Element can't be deleted from this position");
        }
        else{
             int arr2[] = new int[size-1];

        int i = 0;
        int j = 0;
        while(i < arr.length && j < arr2.length){
            if( i == (position - 1)){
                i++;
            }
            else{
                arr2[j] = arr[i];
                i++;
                j++;
            }

        }

        for(int k = 0; k < arr2.length; k++){
            System.out.print(arr2[k] + " ");
        }
        }
       

    }
}