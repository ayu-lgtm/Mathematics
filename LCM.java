import java.util.*;

class LCM {

    public static void LCM_(int a, int b) {
        int max = Math.min(a, b);
        while (true) {
            if (max % a == 0 && max % b == 0) {
                System.out.println(max);
                break;
            }
            max++;
        }

    }

    public static int HCF(int a,int b){
        if(b==0){
            return a;
        }
        else{
            return HCF(b, a%b);
        }

    }
    public static void HCF_using_LCM(int a,int b){

        int hcf =HCF(a, b);

        int LCM = (a*b)/hcf;

        System.out.print(LCM);

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        LCM_(a, b);
        HCF_using_LCM(a,b);
        sc.close();
    }
}