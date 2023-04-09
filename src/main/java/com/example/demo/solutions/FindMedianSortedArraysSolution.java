package com.example.demo.solutions;

/**
 * 给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。
 * <p>
 * 算法的时间复杂度应该为 O(log (m+n)) 。
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums1 = [1,3], nums2 = [2]
 * 输出：2.00000
 * 解释：合并数组 = [1,2,3] ，中位数 2
 * <p>
 * 示例 2：
 * <p>
 * 输入：nums1 = [1,2], nums2 = [3,4]
 * 输出：2.50000
 * 解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5
 */
public class FindMedianSortedArraysSolution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        return findMedianSortedArrays(nums1, nums2, 0, nums1.length, 0, nums2.length);
    }

    private double findMedianSortedArrays(int[] nums1, int[] nums2, int l1, int h1, int l2, int h2) {
        return 0;
    }
}
