import java.util.Arrays;
import java.util.Scanner;

public class Sieve_Of_Eratosthenes {

    public static void Sieve_(int n) {

        if (n <= 1) {
            return;
        }
        boolean isPrime[] = new boolean[n + 1];

        Arrays.fill(isPrime, true);

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = 2 * i; j <= n; j=j+i) {
                    isPrime[j] = false;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        Sieve_(a);

        sc.close();
    }
}
