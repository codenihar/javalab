import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String text = "Java is a programming language. Java is widely used for developing applications.";

        Map<String, Integer> wordFrequency = countWordFrequency(text);

        // Displaying the word frequency
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<String, Integer> countWordFrequency(String text) {
        Map<String, Integer> wordFrequency = new HashMap<>();
        StringTokenizer tokenizer = new StringTokenizer(text);

        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken().toLowerCase();
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        return wordFrequency;
    }
}
