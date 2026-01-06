package myfirst;

public class StringMethord {
	public static void main(String[] args) {
		String str = "Java";
		String strHello = "hello";
		String strNewHello = "Hello";
		System.out.println(str.length());
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());

		String newHello = strNewHello.toLowerCase();
		// NOTE : - Because string method create new object in 'Heap' and "strHello"
		// created in 'String-Pool'.
		System.out.println(newHello == strHello); // return false

		String strTrim = "          Hello World             ";
		System.out.println(strTrim.trim());

		String strSubStr = "Hello World string in Java language";
		System.out.println(strSubStr.substring(0, 10));

		// String other Methords : -
		// 1. Inspection & Information

		// length() : Returns the number of characters in the string as an int.
		// charAt(int index) : Returns the char at the specific index.
		// isEmpty() : Returns true if the length is 0.
		// isBlank() : Returns true if the string is empty or contains only white space.
		// hashCode() : Returns the int hash code of the string.

		// 2. Comparison

		// equals(Object obj) : Compares the content of two strings for an exact match.
		// equalsIgnoreCase(String another) : Compares content while ignoring case
		// differences.
		// compareTo(String another) : Compares strings lexicographically, returning an
		// int.
		// contains(CharSequence s) : Checks if the string contains a specific sequence.
		// startsWith(String prefix) / endsWith(String suffix) : Checks if the string
		// begins or ends with specified characters.

		// 3. Search & Extraction

		// indexOf(String str) : Returns the index of the first occurrence of the
		// specified substring, or -1 if not found.
		// lastIndexOf(String str) : Returns the index of the last occurrence of the
		// specified substring.
		// substring(int beginIndex, int endIndex) : Extracts a part of the string
		// starting from beginIndex (inclusive) to endIndex (exclusive).

		// 4. Modification & Formatting

		// toLowerCase() / toUpperCase() : Converts all characters to the specified
		// case.
		// trim() : Removes leading and trailing white spaces.
		// strip() : A more robust alternative to trim() that handles Unicode-specific
		// whitespace.
		// replace(char old, char new) : Replaces all occurrences of a character with a
		// new one.
		// replaceAll(String regex, String replacement): Replaces all matches of a
		// regular expression.
		// concat(String str) : Appends a string to the end of another.
		// split(String regex) : Breaks the string into a String[] array based on the
		// given regex.

		// 5. Conversion & Utilities

		// toCharArray() : Converts the string into a new character array (char[]).
		// valueOf(AnyType value) : Static method that converts various data types (int,
		// boolean, etc.) into a string.
		// format(String format, Object... args) : Returns a formatted string based on
		// specified specifiers.
		// join(CharSequence delimiter, CharSequence... elements): Joins multiple
		// strings using a specific separator.

		// 6. Regular Expressions
		String strExp1 = "abc";
		System.out.println("Regular Exp : - " + strExp1.matches("."));
	}
}
