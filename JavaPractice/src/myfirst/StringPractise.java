package myfirst;

public class StringPractise {
	public static void main(String [] args) {
		
		//String(string)
		String str1="Java";
		String str2=new String("JAVA");
		//String(char[])
		char c[]= {'H','e','l','l','o'};
		String  str3=new String(c,1,3);
		//String(byte[])
		byte b[]= {65,66,67,68};
		String str4=new String(b,2,2);
		
		System.out.println(str3);
		
		// String Constant Pool (String Pool)
// 		A special memory area within the heap that stores unique string literals. 
//		This mechanism is a key memory optimization feature in the Java Virtual Machine (JVM) 
//		designed to reduce memory consumption and improve performance by reusing immutable string objects.
		
		String strPool1="Java";
//		String strPool2="Java";
		//String strPool2="java";
		String strPool2=new String("Java");
		System.out.println(strPool1 == strPool2);
	}
}
