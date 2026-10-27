import java.util.Collections;

import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        int[] merged = new int[n1 + n2];

        System.arraycopy(nums1, 0, merged, 0, n1);
        System.arraycopy(nums2, 0, merged, n1, n2);

        Arrays.sort(merged);

        int length = merged.length;

        if (length % 2 == 0) {
            int mid = length / 2;
            return (merged[mid - 1] + (double) merged[mid]) / 2;
        } else {
            return merged[length / 2];
        }
    }
}