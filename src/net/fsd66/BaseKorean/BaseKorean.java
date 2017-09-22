package net.fsd66.BaseKorean;

import java.util.LinkedList;

public class BaseKorean {
	private final int KOREAN_UNICODE_START = 0x0000AC00; // Inclusive
	private final int KOREAN_UNICODE_END = 0x0000D7A4; // Exclusive
	
	public String convertToKorean(int n) {
		LinkedList<Integer> digits = new LinkedList<Integer>();
		int memory = n;
		boolean negative = memory < 0;
		
		if(negative) {
			memory *= -1;
		}
		
		int quotient = 0;
		int remainder = 0;
		
		while(true) {
			quotient = memory / (KOREAN_UNICODE_END - KOREAN_UNICODE_START);
			remainder = memory % (KOREAN_UNICODE_END - KOREAN_UNICODE_START);
			digits.addFirst(remainder + KOREAN_UNICODE_START);
			memory = quotient;
			if(memory == 0) break;
		}
		
		String output = (negative) ? "-" : "";
		
		for(Integer i : digits) {
			output += (char) i.intValue();
		}
		return output;
	}
}
