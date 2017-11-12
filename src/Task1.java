import java.util.Scanner;

public class Task1 {
    public static int greaterThanNumber = 200;
    public static void main(String[] args) {
        int num1, num2, sum;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give two natural numbers (both not greater than " + Task1.greaterThanNumber + ")");
        System.out.print("num1=");
        num1 = scanner.nextInt();
        if (!Task1.isInputNumberCorrect(num1))
            return;

        System.out.print("num2=");
        num2 = scanner.nextInt();
        if (!Task1.isInputNumberCorrect(num2))
            return;

        sum = num1 + num2;
        System.out.println("sum=" + sum);

    }

    public static boolean isInputNumberCorrect(int number) {
        if (number < 1) {
            System.out.println("It's not a natural number");
            return false;
        } else if (number > Task1.greaterThanNumber) {
            System.out.println("Number is greater than " + Task1.greaterThanNumber);
            return false;
        } else
            return true;
    }
}

