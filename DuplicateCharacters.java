// Q4: Write a Java Program to find the duplicate characters in a string.
import java.util.HashMap;

public class DuplicateCharacters {
    public static HashMap<Character, Integer> findDuplicates(String str) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        
        for (char ch : str.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }
        
        HashMap<Character, Integer> duplicates = new HashMap<>();
        for (char ch : charCount.keySet()) {
            if (charCount.get(ch) > 1) {
                duplicates.put(ch, charCount.get(ch));
            }
        }
        
        return duplicates;
    }
    
    public static void main(String[] args) {
        String str = "Java Program";
        HashMap<Character, Integer> duplicates = findDuplicates(str);
        
        for (char ch : duplicates.keySet()) {
            System.out.println(ch + ": " + duplicates.get(ch));
        }
    }
}
