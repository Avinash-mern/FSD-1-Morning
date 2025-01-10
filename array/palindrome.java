import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int size = sc.nextInt();
        System.out.println("Enter Array elements : ");
        int[] arr = new int[size];
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        int[] rev = new int[size];
        //this is reversing the array
        for(int i = 0; i<size; i++){
            rev[i] = arr[size-i-1]; 
        }
        boolean check = true;
        for(int i = 0; i<size; i++){
            
            if(arr[i] != rev[i]){
                check = false;
                break;
            }
        }
        
        if(check == true){
            System.out.println("Array is palindrome");
        }
        else{
            System.out.println("Array is not palindrome");
        }
        
    }
}
