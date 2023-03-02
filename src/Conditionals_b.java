import java.util.Scanner;

public class Conditionals_b {
    public static void main(String[] args) {

        // input for the number of apples
        Scanner in = new Scanner(System.in);
        System.out.println("What day of the week is it?");
        String day = in.next();

        switch (day) {
            case "Monday":
                System.out.println("You can fall apart");
                break;
            case "Tuesday":
                System.out.println("Break my heart");
                break;
            case "Wednesday":
                System.out.println("Break my heart2");
                break;
            case "Thursday":
                System.out.println("Does not even start");
                break;
            case "Friday":
                System.out.println("I'm in love!");
                break;
            case "Saturday":
                System.out.println("Wait");
                break;
            case "Sunday":
                System.out.println("Always comes too late");
                break;
            default:
                System.out.println("That is not a day of the week, try again");
                break;
        }
        in.close();
    }
}