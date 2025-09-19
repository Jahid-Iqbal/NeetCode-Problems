package sliding_window;

/*

*219
Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
Example 1:
Input: nums = [1,2,3,1], k = 3
Output: true

Example 2:
Input: nums = [1,0,1,1], k = 1
Output: true

Example 3:
Input: nums = [1,2,3,1,2,3], k = 2
Output: false
*
* */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicateII {
    /*public boolean containsNearbyDuplicate(int[] nums, int k){
        int left = 0, right = k;
        Set<Integer> set = new HashSet<>();
        while (right-1<nums.length){
            for(int i = left; i<=right; i++){
                if (set.contains(nums[i]))
                    return true;
                set.add(nums[i]);
            }
            set.clear();
            left++;
            right++;
        }
        return false;
    }*/

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> window = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (window.containsKey(nums[i]) && Math.abs(window.get(nums[i]) - i) <= k) {
                return true;
            }
            window.put(nums[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 3};
        System.out.println(new ContainsDuplicateII().containsNearbyDuplicate(arr, 2));
    }
}
