package Easy;

/*
217. Contains Duplicate
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:

Input: nums = [1,2,3,1]

Output: true

Explanation:

The element 1 occurs at the indices 0 and 3.

Example 2:

Input: nums = [1,2,3,4]

Output: false

Explanation:

All elements are distinct.

Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]

Output: true


 */

import java.sql.PreparedStatement;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class L217_ContainsDuplicate {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter teh elements: ");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        boolean result ;
        result = containsDuplicate2(nums);   //best answer
//        result = containsDuplicate1(nums);

        System.out.println("Result : "+ result);

    }


    public static boolean containsDuplicate2(int[] nums) {

        Set<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }



    public static boolean containsDuplicate1(int[] nums) {
         for (int i = 0; i < nums.length; i++) {
             for (int j = i + 1; j < nums.length; j++) {
                 if (nums[i] == nums[j]) {
                     return true;
                 }
             }
         }
         return false;
    }

}
