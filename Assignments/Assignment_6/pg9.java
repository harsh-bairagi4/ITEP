import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of first array:  ");
        int size1 = sc.nextInt();

        int a[] = new int[size1];

        System.out.println("Enter the length of second array: ");

        int size2 = sc.nextInt();

        int b[] = new int[size2];

        System.out.println("Enter the elements of first array: ");
        for(int i = 0; i < size1; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the elements of second array: ");
        for(int i = 0; i < size2; i++){
            b[i] = sc.nextInt();
        }

        for(int i = 0; i < size1; i++){
            System.out.print(a[i] + " ");
        }

        System.out.println();

        for(int i = 0; i < size2; i++){
            System.out.print(b[i] + " ");
        }
        System.out.println();
        System.out.println(union(a, b));

    }

    public static int union(int a[] , int b[]){
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int x = a.length >= b.length ? a.length : b.length;
        int y = 0;
        for(int i = 0 ; i < x; i++){
            if(x > b.length){
                ans.add(a[i]);
                y = b.length;
            }
            else{
                ans.add(b[i]);
                y = a.length;
            }
           
        }
        for(int i = 0 ; i < y; i++){
            if(y == b.length){
                if(!ans.contains(b[i])){
                ans.add(b[i]);
            }
            }
            else{
                if(!ans.contains(a[i])){
                ans.add(a[i]);
            }
            }
            
        }
        for(int i = 0; i < ans.size(); i++){
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();

        return ans.size();
    }
}