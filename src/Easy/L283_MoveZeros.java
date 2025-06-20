package Easy;
/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.



Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]

 */
import java.util.Arrays;
import java.util.Scanner;

public class L283_MoveZeros {

    public static void moveZeroes(int[] nums) {

        int last = nums.length;
        int i = 0;

        while (i < last) {
            if (nums[i] == 0) {
                for (int j = i + 1; j < last; j++) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
                last--;
            }
            if (nums[i] == 0) {
                continue;
            }

            i++;

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number Elements:");
        int len = sc.nextInt();
        int[] nums = new int[len];
        System.out.println("Enter th elements: ");

        for (int i = 0; i < len; i++) {
            nums[i] = sc.nextInt();
        }
        moveZeroes(nums);

        System.out.println("After moving zeros: "+ Arrays.toString(nums));
    }
}
