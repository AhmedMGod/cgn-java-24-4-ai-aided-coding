package org.example;

public class PalindromeChecker {

    public static boolean isPalindrome(String input) {
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String testString1 = "madam";
        String testString2 = "hello";

        System.out.println(testString1 + " is a palindrome: " + isPalindrome(testString1));
        System.out.println(testString2 + " is a palindrome: " + isPalindrome(testString2));
    }
}
