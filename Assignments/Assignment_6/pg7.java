import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the sum to be checked: ");
        int sum = sc.nextInt();

        boolean found = false;
        for(int i = 0; i < size ; i++){
            int ans = 0;
            for(int j = i; j < size; j++){
                ans += arr[j];
                if(ans == sum){
                    System.out.println("The subarray is from position " + (i+1) + " to "+ (j+1));
                    found = true;
                   break;
                }
                 
            }
            if(found) break;
        }

        if(!found){
            System.out.println("No subarray with the given sum was found.");
        }
    }
}