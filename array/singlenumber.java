import java.util.*;


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array ; ");
        int size = sc.nextInt();
        System.out.println("Enter Array Elements : ");
        int[] arr = new int[size];
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i = 0; i<size; i=i+2){
            if(arr[i] != arr[i+1]){
                System.out.print("Single Element is : " + arr[i]);
                break;
            }
        }
    }
}
