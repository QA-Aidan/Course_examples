import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {

        // this is one way to get an input
        // it is more complexed but also more compatible
        Scanner in = new Scanner(System.in);
        System.out.println("How many apples do you have?");
        int apples = in.nextInt();
        System.out.println("You have " + apples + " apples");

        // to input a String
        System.out.println("What is your first name?");
        String firstName = in.next();

        // or the console version
        System.out.println("Please enter your last name");
        String lastName = System.console().readLine();
        System.out.println("Your full name is: " + firstName + " " + lastName);

        in.close();
    }
}
