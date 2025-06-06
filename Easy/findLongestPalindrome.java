

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class findLongestPalindrome {

    public static void main(String[] args) {
        String[] arr = {"abc", "madam", "hello", "racecar", "noon"};
        System.out.println("Longest Palindrome: " + findLongestPalindrome(arr)); // Output: racecar
    }

    public static String findLongestPalindrome(String[] arr) {
        String longest = "";
        for (String str : arr) {
            if (isPalindrome(str) && str.length() > longest.length()) {
                longest=str;
            }
        }
        return longest;
} //TC=O(N * K). SC=0(1).

    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left++) != str.charAt(right--)) {
                return false;
            }
        }
        return true;
    }

}

