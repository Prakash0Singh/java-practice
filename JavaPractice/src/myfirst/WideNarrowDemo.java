package myfirst;

public class WideNarrowDemo {
	public static void main (String [] args) {
		byte b =10; 
		short s = 10; // 200;
		int i = 10;
		float f = 10;
		long l=10;
		double d = 10;
		char c = 10;
		boolean bl = true;
		
		// widening is also known as "upcasting"
		// widening is implicit process it mean it can easily assign small data type to larger data-type
		// but for assigning big data-type to small data-type we need to do "narrowing" forcefully and it cause data-lose as well
		
//		b=s;  "Narrowing"
//		s=b; // "widening"
//		i=b;
//		l=b;
//		f=b;
//		c=b; // Wrong data type
		
		// "Narrowing" assign
		// only use when you know the data and sure you not loose any that 
		// like in here short "s" is 10
		b=(byte)s;
		System.out.println(b);
		// result "-56" if we assign short "s" value because we may loose data on "Narrowing"
		
	}
}
