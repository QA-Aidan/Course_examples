import java.util.Scanner;

public class Conditionals_d {
    public static void main(String[] args) {
        // input for the operation to calculate
        Scanner inS = new Scanner(System.in);
        Scanner in1 = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        System.out.println("Please use the +, -, / or * symbol to select the plus, minus, divide or multiply function");
        String symbol = inS.nextLine();
        System.out.println("Please enter the first number");
        int num1 = in1.nextInt();
        System.out.println("Please enter the second number");
        int num2 = in2.nextInt();

        if ("+".equals(symbol)) {
            System.out.println("The result is : " + Conditionals_d.add(num1, num2));
        } else if ("-".equals(symbol)) {
            System.out.println("The result is : " + Conditionals_d.subtract(num1, num2));
        } else if ("*".equals(symbol)) {
            System.out.println("The result is : " + Conditionals_d.multiply(num1, num2));
        } else if ("/".equals(symbol)) {
            System.out.println("The result is : " + Conditionals_d.divide(num1, num2));
        } else {
            System.out.println("That is not a valid symbol, select + - * /");
        }
        inS.close(); in1.close(); in2.close();
    }

    public static int add(int number_1, int number_2) {
        int result = number_1 + number_2;
        return result;
    }

    public static int subtract(int number_1, int number_2) {
        int result = number_1 - number_2;
        return result;
    }

    public static int multiply(int number_1, int number_2) {
        int result = number_1 * number_2;
        return result;
    }

    public static int divide(int number_1, int number_2) {
        int result = number_1 / number_2;
        return result;
    }
}