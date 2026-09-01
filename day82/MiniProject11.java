/**
Day 82 – Mini Project #11
Task: Build a Word Frequency Counter
Input text → Output top-k frequent words.
Goal: Reinforce real-world HashMap application.
 * */
// package day82;

import java.util.*;
import java.util.PriorityQueue;
public class MiniProject11 {
    public static List<String> topKFreqWords(String s, int k){
        Map<String,Integer> map = new HashMap<>();
        List<String> res = new ArrayList<>();
        String cleaned = (s.replaceAll("[^a-zA-Z0-9\\s]","")).toLowerCase(); //System.out.println(cleaned);
        String [] words = cleaned.split("\\s+");

        for(String word:words){
            // System.out.print(word);System.out.print(4);
            map.put(word,(map.getOrDefault(word, 0))+1);
        }

        PriorityQueue<Map.Entry<String,Integer>> pq = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());
        pq.addAll(map.entrySet());

        for(int i=0;i<k && !pq.isEmpty();i++){
            res.add(pq.poll().getKey());
        }return res;
    }
    public static void main(String[] args) {
        String str = "the quick brown fox jumps over the lazy dog. " + "The dog barks, but the fox runs away. The dog is quick too!";
        // String str = "hello world, Hello world";
        System.out.println(topKFreqWords(str, 3));
    }
}

/**
input:
String text = "the quick brown fox jumps over the lazy dog. " +
                      "The dog barks, but the fox runs away. The dog is quick too!";
        System.out.println(topKFrequentWords(text, 3));
        System.out.println(topKFrequentWords(text, 1));
        System.out.println(topKFrequentWords("Hello, world! hello WORLD", 2));
output:
[the, dog, quick]
[the]
[world, hello]
 */

/**
list all mistakes :
Never calls .toLowerCase() — "Hello" and "hello" won't be counted as the same word.
Regex [^a-z0-9\\s] only keeps lowercase letters — combined with mistake #1, uppercase letters get silently stripped out entirely, not just un-lowercased.
cleaned.split("") splits into individual characters, not words — should split on whitespace instead.
pq.mapentry() — method doesn't exist on PriorityQueue.
map.putAll(pq.mapentry()) — wrong direction; the queue should be filled from the map's entries, not the other way around.
res.addKey(pq.pop()) — addKey isn't a List method, and pop() isn't a PriorityQueue method.
No check for empty strings possibly produced by the split, which could pollute the frequency map.

 */