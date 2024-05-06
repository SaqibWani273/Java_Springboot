package leetcode;

/*
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
 and two integers m and n, representing the number of elements in nums1 and nums2
  respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead
 be stored inside the array nums1. To accommodate this, nums1 has a length of m + n,
  where the first m elements denote the elements that should be merged, and the last n 
  elements are set to 0 and should be ignored. nums2 has a length of n.

 

Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined
 elements coming from nums1.

*/
class LeetCode {
    public static void main(String[] args) {
        System.out.println("B4 merge - >");
        System.out.println("nums1 ->");
        int nums1[] = { 1, 2, 3, 0, 0, 0 }, m = 3, nums2[] = { 2, 5, 6 }, n = 3;
        // int nums1[] = { 1, 3, 5, 7, 10, 0, 0, 0, 0, 0 }, m = 5, nums2[] = { 6, 7, 9,
        // 20, 30 }, n = 5;

        // int nums1[] = { 1 }, m = 1, nums2[] = {}, n = 0;
        // int nums1[] = { 2, 0 }, m = 1, nums2[] = { 1 }, n = 1;
        for (var element : nums1) {
            System.out.print(element + " ");
        }
        System.out.println("nums2 ->");
        for (var element : nums2) {
            System.out.print(element + " ");
        }
        System.out.println("After merge - >");
        Test1.merge(nums1, m, nums2, n);
        for (var element : nums1) {
            System.out.print(element + " ");
        }
        System.out.println("nums2 ->");
        for (var element : nums2) {
            System.out.print(element + " ");
        }

    }
}

class Test1 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int initialIndex = 0;
        for (int i = 0; i < m; i++) {
            for (int j = initialIndex; j < n; j++) {
                if (nums1[i] > nums2[j]) {
                    // rightshift elements in nums1 array
                    for (int k = m; k > i; k--) {

                        nums1[k] = nums1[k - 1];
                    }
                    // add element from nums2 to nums1
                    nums1[i] = nums2[j];
                    initialIndex++;
                    m++;
                }
            }
        }
        // add the remaining elements of nums2 at the end of nums1
        for (int i = initialIndex; i < n; i++) {
            nums1[m++] = nums2[i];
        }
    }
}
