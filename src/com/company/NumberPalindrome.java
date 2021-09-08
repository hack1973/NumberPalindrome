package com.company;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;
        int lastDigit;
        while (number != 0) {
            lastDigit = number % 10;
            reversedNumber = reversedNumber * 10;
            reversedNumber = reversedNumber + lastDigit;
            number = number / 10;
        }
        return reversedNumber == originalNumber;
    }
}
