package problem01;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] arr = { -10, -3, 5, 6, -20 };
		findMaxProduct(arr);
	}

	public static void findMaxProduct(int[] arr) {
	
		int max = 0;
		int temp =0;
		int[] num = new int[2];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				 temp = arr[i]*arr[j];
				 
					if(temp>max) {
						num[0] = arr[i];
						num[1] = arr[j];
						max = temp;
					}	
			}
			
			
		}
		
		System.out.println(Arrays.toString(num));
		
	
		
		
		
		
		
	}
}
