import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int even = 0;
        int odd = 0;
        System.out.println("Enter each element: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            if(arr[i] % 2 == 0){
                even += arr[i];
            }
            else{
                odd += arr[i];
            }
        }
        System.out.println("The even sum is: " + even);
        System.out.println("The odd sum is: " + odd);
    }   
}