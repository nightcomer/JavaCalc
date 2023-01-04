import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First Number: ");
        int num1 = scanner.nextInt();

        System.out.println("Second Number: ");
        int num2 = scanner.nextInt();

        System.out.println("Operation (+,-,*,/): ");
        char op = scanner.next().charAt(0);

        int result = 0;

        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            }

        System.out.println("Result: "+ result);
    }
}
