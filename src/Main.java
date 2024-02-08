// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        printNumbers(5);
    }

    static void printNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            printNumber(i);
        }
    }

    static void printNumber(int num) {
        if (num > 0) {
            System.out.print(num + " ");
            printNumber(num - 1);
        }
    }
}