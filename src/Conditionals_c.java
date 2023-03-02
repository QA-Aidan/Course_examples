import java.util.Scanner;

public class Conditionals_c {
    public static void main(String[] args) {

        // input for the number of apples
        Scanner in = new Scanner(System.in);
        System.out.println("How many apples do you have?");
        int apples = in.nextInt();

        if (apples >= 0 && apples <= 10) {
            System.out.println("Buy more apples");
        } else if (apples >= 11 && apples <= 20) {
            System.out.println("get eating the apples");
        } else if (apples >= 21 && apples <= 30) {
            System.out.println("Make an apple pie");
        } else if (apples >= 31 && apples <= 40) {
            System.out.println("A sack full of apples");
        } else if (apples >= 41 && apples <= 50) {
            System.out.println("Time to make cider");
        } else if (apples >= 51) {
            System.out.println("That is a lot of apples");
        } else {
            System.out.println("I love apples, but that is not a valid number");
        }
        in.close();
    }

}