import java.util.Scanner;

public class Divisisors_In_SortedOrder {
    public static void All_Divisors(int n){
        int i;
        for(i =1;i*i<n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }   
        }
        for(;i>=1;i--){
            if(n%i==0){
                System.out.print(n/i+" ");
            }
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        All_Divisors(a);

        sc.close();
    }
}
