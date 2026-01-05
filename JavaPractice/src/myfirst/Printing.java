package myfirst;

public class Printing {
	public static void main(String [] args) {
		int x = 10 , y = 20;
		
		System.out.println(x+y);
		System.out.println("This is concationation : "+10+20);
		System.out.println(x+y+ " is the result ");
		System.out.println("Sum is : "+ (x+y));
		
		int a =12;
		float b =54.32f;
		char c = 'C';
		String str = "Java language";
		System.out.printf("Hello %d %f %c world !!!\n",a,b,c);
		System.out.printf("%3$s %2$f %1$d \n",a,b,str);
		System.out.printf("%05d\n",12);
		System.out.format ("%4.2f",b);
		
	}
}
