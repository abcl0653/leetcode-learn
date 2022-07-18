package com.leetcode;
import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class MergeSortedArray88Test {
    @Test
    public void simpleCase() {
        MergeSortedArray88 s = new MergeSortedArray88();

        int[] nums1 = new int[]{1,2,4,0,0};
        int[] nums2 = new int[]{3,5};
        s.merge(nums1, 3, nums2, 2);

        assertThat(nums1).isEqualTo(new int[]{1,2,3,4,5});
    }


    @Test
    public void simpleCase2() {
        MergeSortedArray88 s = new MergeSortedArray88();

        int[] nums1 = new int[]{1};
        int[] nums2 = new int[]{};
        s.merge(nums1, 1, nums2, 0);

        assertThat(nums1).isEqualTo(new int[]{1});
    }
    @Test
    public void simpleCase3() {
        MergeSortedArray88 s = new MergeSortedArray88();

        int[] nums1 = new int[]{0};
        int[] nums2 = new int[]{1};
        s.merge(nums1, 0, nums2, 1);

        assertThat(nums1).isEqualTo(new int[]{1});
    }

    @Test
    public void simpleCase4() {
        MergeSortedArray88 s = new MergeSortedArray88();

        int[] nums1 = new int[]{0,0,0,0};
        int[] nums2 = new int[]{1,2,3,4};
        s.merge(nums1, 0, nums2, 4);

        assertThat(nums1).isEqualTo(new int[]{1,2,3,4});
    } 


    @Test
    public void simpleCase5() {
        MergeSortedArray88 s = new MergeSortedArray88();

        int[] nums1 = new int[]{2,0};
        int[] nums2 = new int[]{1};
        s.merge(nums1, 1, nums2, 1);

        assertThat(nums1).isEqualTo(new int[]{1,2});
    } 
}
