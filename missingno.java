import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = sc.nextInt();
        System.out.print("Enter Array elements : ");
        int[] arr = new int[n-1];
        for(int i = 0; i<n-1; i++){
            arr[i] = sc.nextInt();
        }
        int sum = (n*(n+1))/2; //sum of numbers till n
        int arrsum = 0;
        for(int i = 0; i<n-1; i++){
            arrsum = arrsum + arr[i];
        }
        System.out.println("Missing element is : " + (sum-arrsum));
    }
}
