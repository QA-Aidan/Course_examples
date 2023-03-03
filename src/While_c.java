public class While_c {
    public static void main(String[] args) {
        // """This while loop iterates (counts) through all the numbers and stops
        // when......
        // can you guess?
        int numbers[] = { 1, 2, 3, 4, 5 };
        int i = 0;

        while (i < numbers.length) {
            System.out.println("This is number " + numbers[i]);
            i++;
        }
    }
}