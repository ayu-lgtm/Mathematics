import java.util.Scanner;

public class Int_Palindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int temp = num;
        int rev=0;
        while (temp > 0) {

            int l = temp % 10;
            rev = rev * 10 + l;
            temp = temp / 10;
        }

        if (rev == num) {
            System.out.print("Yes Palindrome");
        } else {
            System.out.print("Not Palindrome");
        }

        sc.close();
    }
}
