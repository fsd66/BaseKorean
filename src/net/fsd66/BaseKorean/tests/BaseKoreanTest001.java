package net.fsd66.BaseKorean.tests;

import net.fsd66.BaseKorean.BaseKorean;

public class BaseKoreanTest001 {
    public static void main(String[] args) {
        int testInt = 25;
        BaseKorean k = new BaseKorean();
        String test = k.convertToKorean(testInt);
        System.out.println(test);
    }
}
