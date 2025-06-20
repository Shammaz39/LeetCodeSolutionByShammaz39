package Easy;

/*
* You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.



Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
Example 2:

Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].
Example 3:

Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]
Explanation: The arrays we are merging are [] and [1].
The result of the merge is [1].
Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.

* */
import java.util.Arrays;
import java.util.Scanner;

public class L88_MergeSortArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int nCount = 0;
        for(int i = m; i < m+n ; i++){
            nums1[i] = nums2[nCount] ;
            nCount++;
        }

        for(int k = 0; k < nums1.length ; k++ ){
            for(int j = k; j < nums1.length ; j++ ){
                if(nums1[k] > nums1[j]){
                    int temp = nums1[k];
                    nums1[k] = nums1[j];
                    nums1[j] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number element of nums1: ");
        int l = sc.nextInt();
        System.out.println("Enter a number element of nums2: ");
        int n = sc.nextInt();

        int[] nums1 = new int[l];
        int[] nums2 = new int[n];
        System.out.println("Enter the elements od nums1: ");
        for (int i = 0; i < l; i++) {
            nums1[i] = sc.nextInt();
        }

        System.out.println("Enter the elements of nums2: ");
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        System.out.println("Enter the number of elements which is considered in nums1:");
        int m= sc.nextInt();
        merge(nums1,m,nums2,n);
        System.out.println("After Merging: "+ Arrays.toString(nums1) );

    }


}
