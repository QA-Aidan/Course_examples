import java.util.NoSuchElementException;
import java.util.Scanner;

public class While_d {
    public static void main(String[] args) {
        // This while loops indefinatley until the user picks 5
        while (true) {
            System.out.println("Please enter a number between 1 and 5");

            // You also have to add your switch statement in a try catch block
            // since you might run into some exception

            try {
                Scanner input = new Scanner(System.in);
                int option = input.nextInt();

                switch (option) {
                    case 1:
                        System.out.println("You have picked option 1");
                        main(args);
                    case 2:
                        System.out.println("You have picked option 2");
                        main(args);
                    case 3:
                        System.out.println("You have picked option 3");
                        main(args);
                    case 4:
                        System.out.println("You have picked option 4");
                        main(args);
                    case 5:
                        System.out.println("You have picked option 5 and will exit");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("This is not a valid Menu Option! \nPlease Select Another");

                        main(args);
                        input.close();
                }

            } catch (NoSuchElementException ex) {
                System.out.println("Invalid input, please provide a number between 1 and 5");
                break;
            }
        }
    }
}