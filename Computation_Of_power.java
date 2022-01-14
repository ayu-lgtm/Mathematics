import java.util.Scanner;

public class Computation_Of_power {
    public static int Power(int a , int b){

        if(b==0){
            return 1;
        }
        int temp = Power(a, b/2);
        temp = temp * temp;
        if(b%2==0){
            return temp;
        }
        else{
            return temp*a;
        }
    }
        public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int res =Power(a,b);

        System.out.print("Power : "+ res);

        sc.close();

    }
}
