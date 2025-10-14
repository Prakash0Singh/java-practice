package myfirst;
import java.util.Scanner;

public class TriangleArea {
	public static void main (String[]args) 
	{
		float triangleBase,triangleHeight,triangleArea;
		System.out.println("Enter Base & Height ");
		
		Scanner sc = new Scanner(System.in);
		triangleBase=sc.nextFloat();
		triangleHeight=sc.nextFloat();
		
		triangleArea = triangleBase*triangleHeight/2;
		
		System.out.println("Area of Triangle is -  "+triangleArea);
		
		// Area of Triangle by all sides
		
		float triSide1,triSide2,triSide3,triSum;
		double triArea;
		
		System.out.println("Enter All side of Triangle ");
		
		Scanner triSc = new Scanner(System.in);
		
		triSide1 = triSc.nextFloat();
		triSide2 = triSc.nextFloat();
		triSide3 = triSc.nextFloat();
		
		triSum  = (triSide1+triSide2+triSide3)/2f;
		triArea = Math.sqrt(triSum*(triSum-triSide1)*(triSum-triSide2)*(triSum-triSide3));
		System.out.println("Area of All 3 side Triangle is -  "+triArea);
		
	}
}
