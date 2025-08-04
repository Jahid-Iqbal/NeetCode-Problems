package arrays_hashing;
/*
* Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.
* Input: nums = [1, 2, 3, 3]
* Output: true
*/
/*
* Take O(n) space
* O(n) time
* */

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static boolean hasDuplicate(int[] nums) {
        Set set  = new HashSet();
        for (int i = 0; i < nums.length; i++) {
            //check whether the value already exists or not in set.
            if (set.contains(nums[i]))
                return true;
            set.add(nums[i]);
        }
        return false;
    }
}
