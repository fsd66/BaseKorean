package net.fsd66.BaseKorean.tests;

import net.fsd66.BaseKorean.BaseKorean;

import java.util.Random;

public class BaseKoreanTest002 {
    public static void main(String[] args) {
        final int NUMBERS_TO_TEST = 20;
        int[] testArray = new int[NUMBERS_TO_TEST];
        String[] outputArray = new String[NUMBERS_TO_TEST];
        BaseKorean k = new BaseKorean();
        Random r = new Random();
        for(int i = 0; i < testArray.length; i++) {
            testArray[i] = r.nextInt();
            outputArray[i] = k.convertToKorean(testArray[i]);
            System.out.println("Test Case #" + i + ": " + testArray[i] + " = " + outputArray[i]);
        }
    }
}
