package arrays_hashing;
/*
 * Given an array of strings strs, group all anagrams together into sublists. You may return the output in any order.
 * An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.

 * Example 1:
 * Input: strs = ["act","pots","tops","cat","stop","hat"]
 * Output: [["hat"],["act", "cat"],["stop", "pots", "tops"]]
 * */


import java.util.*;

public class GroupAnagram {
    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0)
            return new ArrayList();

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            int[] freqArray = new int[26];
            for (char c : str.toCharArray()) {
                freqArray[c - 'a']++;
            }
            String key = Arrays.toString(freqArray);
            System.out.println(key);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}

