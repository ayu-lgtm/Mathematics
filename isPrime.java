import java.util.*;

public class isPrime {
    public static boolean Isprime(int a){
        if(a==1){
            return false;
        }
        if(a==2 || a==3){
            return true;
        }
        if(a%2==0 || a%3==0){
            return false;
        }
        for(int i=5;i*i<=a;i=i+6){
            if(a%i==0 || a%(i+2)==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        boolean ans =Isprime(a);

        if(ans){
            System.out.println("Number is Prime :" +ans);
        }
        else{
            System.out.println("Number is Prime :" +ans);
        }

        sc.close();
    }
}
