
public class Array1 {

	public static void main(String[] args) {
		// an array is a collection of elements that is a fixed size
		// this means that you can index the items in the array
		int[] newarr = {1, 2 , 3, 4, 5};
		String[] nextArr = new String[2];
		nextArr[0] = "Hello";
		nextArr[1] = " there!";
		
		System.out.println(newarr[2]);
		System.out.println(nextArr[0] + nextArr[1]);
		
		 // accessing the elements of the specified array
		for (int i = 0; i < nextArr.length; i++)
		  System.out.println("Element at index " + i + " : "+ nextArr[i]);
	}
}
