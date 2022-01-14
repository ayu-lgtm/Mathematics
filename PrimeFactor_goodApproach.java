import java.util.Scanner;

public class PrimeFactor_goodApproach {
    public static void PrimeFactor_(int a) {

        if(a == 1){
            return;
        }
        for(int i=2;i*i<=a;i++){
            while(a%i==0){
                System.out.print(i+" ");
                a=a/i;
            }
        }
        if(a>1){
            System.out.print(a+" ");
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        PrimeFactor_(a);

        sc.close();
    } 

}
