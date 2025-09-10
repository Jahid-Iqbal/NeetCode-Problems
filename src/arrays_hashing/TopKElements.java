package arrays_hashing;

import java.util.*;

/*
* Given an integer array nums and an integer k, return the k most frequent elements within the array.
* The test cases are generated such that the answer is always unique.
* You may return the output in any order.

* Example 1:
* Input: nums = [1,2,2,3,3,3], k = 2
* Output: [2,3]
* */

/*
* Used a HashMap to trace the frequency
* Used the bucket sort to sort the freq in asc.
* */
public class TopKElements {
    public static int[] topKFrequent(int[] nums, int k){
        Map<Integer, Integer> count = new HashMap<>();
        List<Integer>[] freq = new List[nums.length+1];

        for(int i=0; i<freq.length; i++){
            freq[i] = new ArrayList<>();
        }

        for(int n : nums){
            count.put(n, count.getOrDefault(n,0)+1);
        }

        for(Map.Entry<Integer, Integer> map : count.entrySet()){
            freq[map.getValue()].add(map.getKey());
        }

        int[] res = new int[k];
        int index =0;
        for(int i = freq.length -1; i>0 && index<k; i--){
            for(int n: freq[i]){
                res[index++] = n;
                if(index==k)
                    return res;
            }
        }
        return res;

    }

}
