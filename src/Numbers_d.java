
public class Numbers_d {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 4;
		// Demonstrating numbers in Java 
		// Just adds the two numbers together
		System.out.println("The result is : " + Numbers_d.add(num1, num2));
		System.out.println("The result is : " + Numbers_d.subtract(num1, num2));
		System.out.println("The result is : " + Numbers_d.multiply(num1, num2));
		System.out.println("The result is : " + Numbers_d.divide(num1, num2));

	}

    public static int add(int number_1, int number_2) {
    	int result = number_1 + number_2;
    	return result;
        }
    
    public static int subtract(int number_1, int number_2) {
    	int result = number_1 - number_2;
    	return result;
        }
    
    public static int multiply(int number_1, int number_2) {
    	int result = number_1 * number_2;
    	return result;
        }
    
    public static int divide(int number_1, int number_2) {
    	int result = number_1 / number_2;
    	return result;
        }
}



		
		


