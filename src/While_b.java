import java.util.Scanner;

public class While_b {
    public static void main(String[] args) {
        // Write a while loop which asks for the names of 5 people,
        // and for each person prints their name followed by the text "is awesome!
        Scanner namesIn = new Scanner(System.in);
        int names = 1;
        System.out.println("type the names of 5 people one at a time");

        while (names <= 3) {
            System.out.println("type the name of person number " + names);
            String named_p = namesIn.next();
            System.out.println(named_p + " is awesome!");
            names++;
        }
        namesIn.close();
    }
}