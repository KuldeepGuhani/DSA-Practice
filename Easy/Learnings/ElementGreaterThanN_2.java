/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Learnings;

/**
 *
 * @author root
 */
public class ElementGreaterThanN_2 {

    // TC-> O(n2)  and SC-> O(1).
    static void greaterElement(int[] nums) {
        int index = -1; //for storing index for getting that particular index value.
        int count = 0;
        int maxcount = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > maxcount) {
                maxcount = count;
                index = i;
            }

        }

        if (maxcount > nums.length / 2) {
            System.out.println("" + nums[index]);

        }
    }

    public static void main(String[] args) {
        int A[] = {1, 1, 2, 1, 3, 5, 1};
        greaterElement(A);
    }
}
