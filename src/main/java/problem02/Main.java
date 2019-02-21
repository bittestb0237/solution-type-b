package problem02;

public class Main {

	public static void main(String[] args) {
		String[] expressions = {"3 + 4", "12 * 4", "8 / 2", "10 - 2"};
		
		Add add = new Add();
		Sub sub = new Sub();
		Mul mul = new Mul();
		Div div = new Div();
		
		for(String expression : expressions) {
			String[] tokens = expression.split(" ");
			
			String arith = tokens[1];
			int num1 = Integer.parseInt(tokens[0]);
			int num2 = Integer.parseInt(tokens[2]);
			
			// num1, num2, arith 세 개의 변수와 getInstance 메소드를 사용하여
			// 문제의 결과화면에 맞게 출력하는 계산기 나머지 코드를 아래에 완성 하십시오.
			// 주어진 코드는 수정하지 않습니다.
			
			switch (arith) {
			case "+":
				getInstance(String.valueOf(add.calculate(num1, num2)));
				break;
			case "*":
				getInstance(String.valueOf(mul.calculate(num1, num2)));
				break;
			case "/":
				getInstance(String.valueOf(div.calculate(num1, num2)));
				break;
			case "-":
				getInstance(String.valueOf(sub.calculate(num1, num2)));
				break;
			}
		}
	}
	
	public static Arithmetic getInstance(String arith) {
		System.out.println(arith);
		return null;
	}
	
}

	
