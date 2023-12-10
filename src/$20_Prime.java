import java.util.Scanner;

public class $20_Prime {
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
        System.out.print("Enter start number: ");
        int start = scanner.nextInt();
        int count = 0;
        while (count<20) {
            if (isPrime(start)) {
                System.out.println(start);
                count++;
            }
            start++;
        }

    }
}
