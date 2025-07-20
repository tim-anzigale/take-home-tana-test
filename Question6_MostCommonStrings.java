import java.util.*;

public class Question6_MostCommonStrings {
    public static void main(String[] args) {
        String sentence = "hi there care to discuss algorithm basis or how to solve algorithm or";
        //converts to words theb gets their frequencies 
        String[] words = sentence.toLowerCase().split("\\s+");
        Map<String, Integer> freq = new HashMap<>();
        
        for (String word : words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }
        
        List<String> sorted = new ArrayList<>(freq.keySet());
        sorted.sort((a, b) -> freq.get(b) - freq.get(a));
        
        List<String> top3 = sorted.subList(0, Math.min(3, sorted.size()));//takes the top 3
        Collections.sort(top3);//sorts in alphabetic order
        
        System.out.println(top3);
    }
}
