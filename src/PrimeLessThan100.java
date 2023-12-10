import java.util.Scanner;

public class PrimeLessThan100 {
    public static boolean isPrime (int n) {
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = 2;
        while (start<100) {
            if (isPrime(start)) {
                System.out.println(start);
            }
            start++;
        }

    }
}
