import java.util.Scanner;

public class Shape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                // draw Rectangle
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 6; j++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
            case 2:
                // draw Triangle1
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < i+1; j++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
            case 3:
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5-i; j++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
            case 4:
                for (int i = 0; i < 5; i++) {
                    for (int j = 5-i; j >0 ; j--) {
                        System.out.print(" ");
                    }
                    for (int k = 0; k < 2*i+1; k++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
        }
    }
}
