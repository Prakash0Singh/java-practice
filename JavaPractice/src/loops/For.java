package loops;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int endCount = 10;
		int numb = 2;
		//Simple for loop
		for(int i=1;i<=endCount;i++) {
			System.out.println(numb*i);
		}
		
		// for loop with multiple variables
		
		for(int i=1,j=1;i<=10;i++,j=j*2) {
			System.out.println(i+" "+j);
		}
	}

}
