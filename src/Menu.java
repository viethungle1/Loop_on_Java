import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the rectangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                for (int i = 0; i < 6; i++) {
                    for (int j = 5 - i; j > 0; j--) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                break;
            case 2:
                for (int i = 0; i < 6; i++) {
                    for (int j = 0; j < 6; j++) {
                        System.out.print("*  ");
                    }
                    System.out.print("\n");
                }
            case 3:
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 6; j++) {
                        System.out.print("*  ");
                    }
                    System.out.print("\n");
                }
            case 0:
                System.exit(0);
            default:
                System.out.println("No choice");
        }
    }
}