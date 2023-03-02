
public class Matches {

	public static void main(String[] args) {
		// going to be used for demonstrating numbers in Java 
		// Just counts the number of items in a sequence
		System.out.println(Matches.count("b", "c"));
		System.out.println(Matches.count("a", "a"));
	}

    public static String count(String sequence, String item) {

        for (int i=0 ;i <= 10; i++) {
            if (sequence == item) {
                System.out.println("There is a match " + sequence + " " + "= " + item);
            }
        }
        return sequence + item;
    }
}
