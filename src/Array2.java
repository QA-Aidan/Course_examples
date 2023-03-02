import java.util.ArrayList;
import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		// an array is a collection of elements that is a fixed size
		// this means that you can index the items in the array
		int[] newArr = { 1, 2, 3, 4, 5 };
		System.out.println(newArr[1]);

		String[] nextArr = { "Hello ", "there", ", my name ", "is ", "Aidan" };
		System.out.println(nextArr[0] + nextArr[1] + nextArr[2] + nextArr[3] + nextArr[4]);

		// Arrays Vs ArrayList
		// ArrayList can shrink and grow !
		ArrayList<Integer> ArrayListInt = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		System.out.println(ArrayListInt.get(1));

		// printing is easier in ArrayList and there are more dot functions etc.
		ArrayList<String> ArrayListName2 = new ArrayList<>(Arrays.asList("Cap", "Thor", "Stark", "Star_Lord"));
		System.out.println(ArrayListName2);
	}
}
