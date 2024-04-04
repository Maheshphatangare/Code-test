
Q3: Write a Java Program to count the number of words in a string using HashMap

import java.util.HashMap;

public class WordCount {
    public static HashMap<String, Integer> countWords(String str) {
        HashMap<String, Integer> wordCount = new HashMap<>();
        String[] words = str.split("\\s+");
        
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        
        return wordCount;
    }
    
    public static void main(String[] args) {
        String str = "Write a Java Program to count the number of words in a string using HashMap.";
        HashMap<String, Integer> wordCount = countWords(str);
        
        for (String word : wordCount.keySet()) {
            System.out.println(word + ": " + wordCount.get(word));
        }
    }
}
