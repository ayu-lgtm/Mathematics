import java.util.Scanner;

public class HCF {
    public static void HCF_itr(int m,int n){    //iterative method
        while(m!=n){
            if(m>n){
                m=m-n;
            }
            else{
                n=n-m;
            }
        }
        System.out.print("HCF = "+m);
    }

    public static int HCF_rec(int m,int n){    //iterative method
        if(n==0){
            return m;
        }
        else{
            return HCF_rec(n, m%n);
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int y = sc.nextInt();

        HCF_itr(s,y);

        int a = HCF_rec(s,y);
        System.out.print("\nHCF = "+a);
        sc.close();
    }
}
