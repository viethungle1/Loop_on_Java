import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number ");
        int prime = scanner.nextInt();
        boolean check = true;
        if (prime<2) {
            check = false;
        } else if (prime >3 ) {
            int i=2;
            while (i<prime) {
                if (prime%i==0) {
                    check = false;
                    break;
                }
                i++;
            }
        } else {
            check = true;
        }
        if (check) {
            System.out.print(prime+ " is a prime");
        } else {
            System.out.print(prime+ " is not a prime");
        }
    }
}

