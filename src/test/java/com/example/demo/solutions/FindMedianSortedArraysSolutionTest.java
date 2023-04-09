package com.example.demo.solutions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMedianSortedArraysSolutionTest {

    FindMedianSortedArraysSolution solution;

    @BeforeEach
    void setUp(){
        solution = new FindMedianSortedArraysSolution();
    }
    @Test
    void findMedianSortedArrays() {

        int[] nums1 = new int[]{1, 3};
        int[] nums2 = new int[]{2};
        double result = solution.findMedianSortedArrays(nums1, nums2);
    }
}