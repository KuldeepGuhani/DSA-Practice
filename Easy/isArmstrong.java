package DSA_Learnig2025.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class isArmstrong {

    public static void main(String[] args) {
        int[] testCases = {153, 370, 371, 9474, 123, 0};

        for (int num : testCases) {
            System.out.println("Is " + num + " an Armstrong number? " + isArmstrong(num));
        }
    }

    public static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;

        int n = String.valueOf(num).length(); // Number of digits

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, n);
            num /= 10;
        }

        return sum == original;
  
}
}

