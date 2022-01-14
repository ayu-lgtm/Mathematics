import java.util.Scanner;

public class Iterative_Power {

    public static int Power(int a, int b) {
        int res =1;
        while(b>0){
            if(b%2!=0){
                res=res*a;

            }
            a=a*a;
            b = b/2;

        }
        return res;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = Power(a, b);

        System.out.print("Power :"+res);
        sc.close();
    }
}
