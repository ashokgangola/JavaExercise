package pepCoding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StringDigitMultiplication {
	public static void main(String[] args) {
		int t = 10%10;
		System.out.println(t);
	}
	
	private static void evaluate(String num1, String num2) {
		char[] num1Array = num1.toCharArray();
		char[] num2Array = num2.toCharArray();
		if(num1Array.length > num2Array.length) {
			
		}
	}
	
	private static void multiply(char[] longestArray, char[] shortestArray) {
		Map<Integer, ArrayList<Integer>> multiplicationTable = new HashMap<Integer, ArrayList<Integer>>();
		ArrayList<Integer> rowProduct =  new ArrayList<>();
		
		for(int i=0;i<longestArray.length;i++) {
			int count = 0;
			int carry = 0;
			for(int j=0;j<shortestArray.length;j++) {
				int digit1 = longestArray[i];
				int digit2 = shortestArray[j];
				int multi = digit1* digit2;
				count++;
				if(i==1) {
					multi = rowProduct.get(j)+multi;
				}
				multi += carry;
				if(multi > 10) {
					carry = multi / 10;
					if(i==0) {
						rowProduct.add(multi % 10);
					} else {
						int num = multi % 10;
						int prod = rowProduct.get(count)+num;
						rowProduct.add(count, prod);
					}
				} else {
					if(i==0) {
						rowProduct.add(multi);
					}
				}
			}
			multiplicationTable.put(i, rowProduct);
		}
	}
}
