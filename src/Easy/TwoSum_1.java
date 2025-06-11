package Easy;

/*

1. Two Sum
* Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]


Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.


Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
* */

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum_1 {

    public static int[] twoSum(int[] nums, int target) {

        int[] output = new int[2];
        for(int i = 0; i < nums.length ; i++ ) {
            for(int j = i+1; j < nums.length ; j++ ) {
                if( (nums[i]+ nums[j] )== target){
                    output[0] = i;
                    output[1] = j;
                    return output ;

                }
            }
        }
        return output ;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: \n");
        int len = sc.nextInt();
        System.out.println("Enter the elements of array: \n");
        int[] nums = new int[len];
        for(int i =0 ; i< len ; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the target: \n");
        int target = sc.nextInt();

        System.out.println("Array: " + Arrays.toString(twoSum(nums, target)));

    }
}
