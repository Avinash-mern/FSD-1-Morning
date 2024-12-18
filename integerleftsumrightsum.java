import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int dummy = n;
        int tsum = 0;
        int rsum = 0;
        int lsum = 0;
        int digits = 0;
        while(n != 0){
            int rem = n % 10;
            digits++;
            tsum = tsum + rem;
            n = n / 10;
        }
        int half = digits/2;
        while(half != 0){
            int rem = dummy % 10;
            rsum = rsum + rem;
            dummy = dummy / 10;
            half--;
        }
        lsum  =tsum-rsum;
        System.out.println("Total sum is : " + tsum);
        System.out.println("Left sum is : " + lsum);
        System.out.println("Rightt sum is : " + rsum);
        System.out.print("Product is : " + (lsum*rsum));
    }
}
