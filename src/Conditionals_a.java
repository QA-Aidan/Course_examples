import java.util.Scanner;

public class Conditionals_a {
    public static void main(String[] args) {

        // input for the number of apples
        Scanner in = new Scanner(System.in);
        System.out.println("How many apples do you have?");
        int apples = in.nextInt();

        if (apples > 50) {
            System.out.println("A barrel full of apples");
            System.out.println("time to make cider");
        }

        else if (apples > 30) {
            System.out.println("That is a lot of apples");
            System.out.println("get eating the apples");
        }

        else if (apples > 10) {
            System.out.println("Apple pie anyone?");
        }

        else {
            System.out.println("Buy more apples");
            System.out.println("I love apples");
        }

        // You can also chain the two expressions together
        System.out.println(apples > 10 && apples < 30);
        in.close();
    }

}