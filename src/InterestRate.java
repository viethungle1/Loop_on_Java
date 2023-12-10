import java.util.Scanner;

public class InterestRate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tiền: ");
        double money = scanner.nextDouble();
        System.out.print("Nhập số tháng: ");
        int month = scanner.nextInt();
        System.out.print("Nhập tỷ lệ lãi suất: ");
        double interestRate = scanner.nextDouble();
        double totalInterest =0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate/100)/12 * month;
        }
        System.out.print("Total interest: " + totalInterest);
    }
}
