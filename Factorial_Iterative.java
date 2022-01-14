import java.util.Scanner;



public class Factorial_Iterative {

    public static int Using_Itr(int n){

        int x= 1;
        for(int i=2;i<=n;i++){
            x=x*i;

        }
        return x;
    }

    public static int Using_Recursion(int n){
        if(n==0){
            return 1;
        }
        return n*Using_Recursion(n-1);

    }
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         int num = sc.nextInt();

         int x = Using_Itr(num);

         System.out.print("\nFactorial_itr :"+x);

         int y = Using_Recursion(num);

         System.out.print("\nFactorial_rec :"+y);


         sc.close();
    }
}
