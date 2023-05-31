import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String fileName = "iliad.txt"; // Replace with the actual file name/path

        Set<String> uniqueWords = new HashSet<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\W+"); // Split the line into words using non-word characters as delimiters

                for (String word : words) {
                    if (!word.isEmpty()) { // Skip empty words
                        uniqueWords.add(word.toLowerCase()); // Convert the word to lowercase to ignore case sensitivity
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        int uniqueWordCount = uniqueWords.size();
        System.out.println("Number of unique words: " + uniqueWordCount);
    }
}