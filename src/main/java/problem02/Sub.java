package problem02;

public class Sub implements Arithmetic {
	

	@Override
	public int calculate(int a, int b) {
		return (a>b)?a-b:b-a;
	}
	
	
	

}
