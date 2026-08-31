/**
Day 81 – LinkedHashMap & TreeMap
Concept: Ordered and sorted maps.
Problem: Sort Characters by Frequency – LeetCode 451
Goal: Learn Java’s map variants.
 */
import java.util.*;
import java.util.PriorityQueue; 
public class LeetCode451 {
    public static String frequencySort(String s) {
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();

        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),(map.get(s.charAt(i)))+1);
            }else map.put(s.charAt(i),1);
            // map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        // map.forEach((k,l)-> System.out.println(k +" "+ l));

        PriorityQueue<Map.Entry<Character,Integer>> pq = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());
        // PriorityQueue<Map.Entry<Character,Integer>> pq = new PriorityQueue<>((a,b) -> a.getValue() - b.getValue());
        pq.addAll(map.entrySet());

        StringBuilder res = new StringBuilder();
        while(!pq.isEmpty()){
            Map.Entry<Character,Integer> entry = pq.poll();
            char ch = entry.getKey();
            int freq = entry.getValue();
            for(int i=0;i<freq;i++){
                res.append(ch);
            }
        }
        return res.toString();
    }
    public static void main(String[] args) {
        // String str = "tree";
        // String str = "cccaaa";
        String str = "Aabb";
        System.out.println(frequencySort(str));
    }
}

/**
Example 1:
Input: s = "tree"
Output: "eert"
Explanation: 'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.

Example 2:
Input: s = "cccaaa"
Output: "aaaccc"
Explanation: Both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers.
Note that "cacaca" is incorrect, as the same characters must be together.

Example 3:
Input: s = "Aabb"
Output: "bbAa"
Explanation: "bbaA" is also a valid answer, but "Aabb" is incorrect.
Note that 'A' and 'a' are treated as two different characters.
 */

/** MISTAKES:
how to use put?

 */