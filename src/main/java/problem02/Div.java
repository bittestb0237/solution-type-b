package problem02;

public class Div implements Arithmetic {


	@Override
	public int calculate(int a, int b) {
		return (a>b)?a/b:b/a;
	}
	
	
	
}
