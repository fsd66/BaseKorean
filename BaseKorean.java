package net.fsd66.BaseKorean;

import java.util.LinkedList;

public class BaseKorean {
	private final int KOREAN_UNICODE_START = 0x0000AC00; // Inclusive
	private final int KOREAN_UNICODE_END = 0x0000D7A4; // Exclusive
	
	public String convertToKorean(int n) {
		LinkedList<Integer> digits = new LinkedList<Integer>();
		int numberToConvert = n;
		int memory = numberToConvert;
		int quotient = 0;
		int remainder = 0;
		
		while(true) {
			quotient = memory / (KOREAN_UNICODE_END - KOREAN_UNICODE_START);
			remainder = memory % (KOREAN_UNICODE_END - KOREAN_UNICODE_START);
			digits.addFirst(remainder + KOREAN_UNICODE_START);
			memory = quotient;
			if(memory == 0) break;
		}
		
		String output = "";
		
		for(Integer i : digits) {
			output += (char) i.intValue();
		}
		return output;
	}
	
	public static void main(String[] args) {
		int testInt = 0x0000D7A3 - 0x0000AC00;
		BaseKorean k = new BaseKorean();
		String test = k.convertToKorean(testInt);
		System.out.println(test);
	}
}
