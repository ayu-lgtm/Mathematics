import java.util.Scanner;

public class TrailingZero {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int res=0;
        for(int i=5;i<=num;i=i*5){
            res = res + num/i;
        }

        System.out.print("Trace Zero in "+num+" : "+res);
        sc.close();
    }
}
