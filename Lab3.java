package Lab3;


/**
 * A utility class containing several recursive methods 
 * 
 * <pre>
 * 
 * For all methods in this API, you are forbidden to use any loops, 
 * String or List based methods such as "contains", or methods that use regular expressions
 * You must not define any instance variables to solve the problem. 
 * You must use direct recursion to solve the problem. (no indirect recursion is allowed). 
 * </pre>
 * 
 * @author EECS2030 Fall 2025
 *
 */
public final class Lab3 {
	
	/**
	 * This is empty by design. Lab 3 cannot be instantiated.
	 */
	private Lab3() {
		// empty by design
	}

			  

	/**
	 * Returns the sum of a consecutive set of numbers from <code> start </code> to <code> end </code>. 
	 * 
	 * @pre <code> start </code> and <code> end </code>  are small enough to let this  
	 * method return an int. This means the return value at most requires 4 bytes and 
	 * no overflow would happen.  
	 * 
	 * @param start is an integer number
	 * @param end is an integer number
	 * @return the sum of start + (start + 1) + .... + end
	 */
	public static int sum(int start, int end) {
		
		if (end < start) {
			return 0;
		}
		
		return end + sum(start, end - 1);
	}

	/**
	 * This method creates a string using the given char
	 * by repeating the character <code> n </code> times.
	 * 
	 * @param first is the given character by which the string is made.
	 * @param n is the number of characters in the final string
	 * @return a string made of the given character. 
	 * 
	 * @pre n is not negative.
	 */
	public static String makeString(char first, int n) {
		
		if (n == 0) {
			return "";
		}
		
		return first + "" + makeString(first, n - 1);
	}

	/**
	 * This method gets two strings and interlace a string using the 
	 * these two input strings. The number of words in the returned string is as much 
	 * as the value of the third input parameter.
	 * 
	 * @param first is the string that is used in the even position of the returned result [asuming
	 * that the position starts from zero]
	 * @param second is the string that is used in the odd position of the returned result
	 * @param n is the number of letters in the returned result.
	 * @return returns a string made of the first and the second input parameter. 
	 */
	public static String interlace(String first, String second, int n) {

		if (n == 0) {
			return "";
		}
		else if (n % 2 != 0) {
			return interlace(first, second, n - 1) + "" + first;
		}
		
		return interlace(first, second, n - 1) + "" + second;

	}

	/**
	 * This method returns a substring of the given input string that is enclosed in two 
	 * given characters. 
	 * @param str is a string that contains at least two characters including <code> open </code> and <code> close </code> 
	 * @param open is a character at the beginning of the string that should be returned. 
	 * @param close is a character at the end of the string that should be returned.
	 * @return returns a string enclosed in two given characters of <code> open </code> and <code> close </code>.
	 * @pre The given str contains only one <code> open </code> and one <code> close </code> character.
	 */
	public static String getSubstring(String str, char open, char close) {
		
		if (str.charAt(str.indexOf(open)) == close ) {
			return "" + close;
		}
			
		return str.charAt(str.indexOf(open)) + "" + getSubstring(str.substring(str.indexOf(open)), str.charAt(str.indexOf(open) + 1), close);
	}
	
	/**
	 * This method converts a decimal value into its binary representation. 
	 * @param value is a positive integer number including zero
	 * @return the binary representation of the input.
	 * @pre the input is either a positive integer number or zero. 
	 */
	
	public static String decimalToBinary(int value) {
		
		if (value == 0) {
			return "0";
		}
		else if (value == 1) {
			return "1";
		}
		
		return decimalToBinary(value / 2) + (value % 2);

	}
	
}

