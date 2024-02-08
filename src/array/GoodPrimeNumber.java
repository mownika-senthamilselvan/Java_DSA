package array;
import java.util.Scanner;

public class GoodPrimeNumber {

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    static int findKthGoodPrime(int N, int K) {
        int count = 0;
        int num = N + 1;

        while (count < K) {
            if (isPrime(sumOfDigits(num)) && isPrime(num)) {
                count++;
            }
            num++;
        }

        return num - 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.println("Enter the value of N:");
        int N = scanner.nextInt();

        System.out.println("Enter the value of K:");
        int K = scanner.nextInt();

        // Output
        int result = findKthGoodPrime(N, K);
        System.out.println("The " + K + "th good prime number greater than " + N + " is: " + result);

        scanner.close();
    }
}
