package com.leetcode;
import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class RemoveDuplicate26Test {

// Example 1:

// Input: nums = [1,1,2]
// Output: 2, nums = [1,2,_]
// Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
// It does not matter what you leave beyond the returned k (hence they are underscores).

    @Test
    public void simpleCase() {
        RemoveDuplicate26 r = new RemoveDuplicate26();

        int[] nums = new int[]{0,0,1,2,2};
        int k = r.removeDuplicates(nums);

        assertThat(k).isEqualTo(3);

        assertThat(nums[0]).isZero();
        assertThat(nums[1]).isEqualTo(1);
        assertThat(nums[2]).isEqualTo(2);

    }


    @Test
    public void simpleCase2() {
        RemoveDuplicate26 r = new RemoveDuplicate26();

        int[] nums = new int[]{0};
        int k = r.removeDuplicates(nums);

        assertThat(k).isEqualTo(1);

        assertThat(nums[0]).isZero();

    }
    
}
