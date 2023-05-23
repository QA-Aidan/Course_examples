import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        int fizz = 3;
        int buzz = 5;
        System.out.println("please enter a whole number");
        Scanner fizzing = new Scanner(System.in);
        int remainderFizz = fizzing.nextInt();

        // The most complicated specific case at the top for if statement sorting
        // it is important to point this out to make sure it checks both cases first

        if (remainderFizz % fizz == 0 && remainderFizz % buzz == 0) {
            System.out.println("FizzBuzz");
        } else if (remainderFizz % fizz == 0) {
            System.out.println("Fizz");
        } else if (remainderFizz % buzz == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(fizzing);

        }

    }

}
