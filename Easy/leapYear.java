package DSA_Learnig2025.Arrays;

import java.util.*;

public class leapYear {

    public static void main(String[] args) {

        int n=1996;
        System.out.print(leapyear(n));
        
    }

     public static boolean leapyear(int year) {
        if (year % 4 != 0) {
            return false; // not divisible by 4
        } else if (year % 100 != 0) {
            return true;  // divisible by 4 but not 100
        } else if (year % 400 == 0) {
            return true;  // divisible by 400
        } else {
            return false; // divisible by 100 but not by 400
        }
    }
//| ----- | ----- |
//| Time  | O(1)  |
//| Space | O(1)  |

}

