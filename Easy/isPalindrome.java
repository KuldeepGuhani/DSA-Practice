package DSA_Learnig2025.Arrays;

import java.util.*;

public class isPalindrome {

    public static void main(String[] args) {
        //String str="Was it a car or a cat I saw?";
        String str = "ab..aba";
        System.out.println(isPalindromeOPTIMAL(str));
    }

//    public static boolean isPalindrome(String str){
//        str=str.replaceAll("[.*+?^${}()|\\\\[\\\\]\\\\\\\\]", "").replaceAll("\\s", "").toLowerCase();
//        System.out.print(" "+str);
//        System.out.println();
//        int n=str.length();
//        for(int i=0;i<=str.length()/2;i++){
//            //System.out.print("i "+i+" n-1 "+(n-i-1));
//            if(str.charAt(i)!=str.charAt(n-i-1)){
//                return false;
//            }  
//        }
//        return true;
//    }
//    public static boolean isPalindromeBRF(String str){
//        str=str.toLowerCase().replaceAll("[^a-z0-9]", "");
//        
//        String reverse=new StringBuilder(str).reverse().toString();
//        
//        return str.equals(reverse);
//    }
//    TC=N ,
//    SC =N; due to reverse string .
    public static boolean isPalindromeOPTIMAL(String str) { //two pointer

        str = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
//        while (left < right && !Character.isLetterOrDigit(input.charAt(left))) { 
//            left++;
//        }   this code is use for skipping unwanted/non-alphanumeric charcter if they not matched. 
//        while (left < right && !Character.isLetterOrDigit(input.charAt(right))) {
//            right--;
//        }
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;

        }

        return true;
    }

    //TC =O(N)
    //SC =O(1)
    
}

