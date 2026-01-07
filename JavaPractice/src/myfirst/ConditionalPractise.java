package myfirst;

public class ConditionalPractise {
	public static void main(String [] args) {
		
		int a=5,b=10,c=15;
		
		System.out.println(a<b);
		System.out.println(a<b && a>c);
		System.out.println(a<b || a<c);
		
		if(a>10) {
			System.out.println("A is Greater");
		}
		else {
			System.out.println("A is Smaller");
		}
		
	}
}
