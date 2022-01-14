import java.util.*;

// iteration method

public class CountDigit {

    public static void iterative_method(int number) { // iterative_method
        int count = 0;

        while (number != 0) {
            number = number / 10;
            count = count + 1;
        }

        System.out.print("\nNo. of Digits in iterative : " + count);
    }

    public static int recursive_method(int number) { // recursive_method
        if (number == 0) {
            return 0;
        }
        return 1 + recursive_method(number / 10);
    }

    public static void logrithm_method(int number) { // logrithm_method(
        int a = (int) Math.floor(Math.log10(number) + 1);

        System.out.print("\nNo. of Digits in Logrithm  : " + a);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        iterative_method(number);
        int digit = recursive_method(number);

        System.out.print("\nNo. of Digits in Recursive : " + digit);

        logrithm_method(number);

        sc.close();
    }
}
