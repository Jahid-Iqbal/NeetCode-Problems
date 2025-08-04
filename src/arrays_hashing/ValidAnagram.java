package arrays_hashing;

import java.util.HashMap;
import java.util.Map;

/*
* Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.
* An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.
*
* Example 1:
* Input: s = "racecar", t = "carrace"
* Output: true
* */
public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();
        if (s.length() != t.length())
            return false;
        for (char c: s.toCharArray()) {
            mapS.put(c, mapS.getOrDefault(c, 0) + 1);
        }
        for (char c: t.toCharArray()) {
            mapT.put(c, mapT.getOrDefault(c,0)+1);
        }
        if (mapS.equals(mapT))
            return true;
        else
            return false;
    }
}
