import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nEnter the element to be searched: ");
        int element = sc.nextInt(); 

        int start = 0;
        int end = n - 1;
        boolean exist = false;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == element){
                System.out.print("The " + element + " is at index number " + mid);
                exist = true;
                break;
            }
            else if(arr[mid] < element){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        if(!exist){
            System.out.println("The element doesn't exists");
        }
    }
}