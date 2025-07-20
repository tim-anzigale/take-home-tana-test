import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Question1_GetLongestString {
    public static void main(String[] args) {
        // Here i have used a list to add sample strings just like one provided in the question example.
        List<Character> characters = Arrays.asList('A', 'B', 'C', 'D');
        String[] strings = {"AABCDA", "ABCDZADC", "ABCDBCA", "ABCDABDCA"};

        String longest = getLongestString(characters, strings);
        System.out.println("Longest Valid String is: \"" + longest + "\"");
    }

    // This function checks if the string contains only the valid characters
    public static boolean getValidString(String str, List<Character> characters){
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!characters.contains(c)) {
                return false;  // found invalid character
            }
        }
        return true;  // all characters are valid
    }
    
    // Here im checking if the string has no repetitive characters by checking if the current character is equal to the previous one.
    public static boolean getStringWithNonRepetitive(String str) {
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                return false;
            }
        }
        return true;
    }
    
    // Main function with the required signature from the problem
    public static String getLongestString(List<Character> characters, String[] strings) {
        //Here i have instantiated a list that will have the intended output or result.
        List<String> results = new ArrayList<>();
        
        for (String str : strings) {
            //Here i am checking whether the string contains the required characters and whether it has no repetitive characters.
            //if it passes both checks then i add it to the results list.
            if (getValidString(str, characters) && getStringWithNonRepetitive(str)) {
                results.add(str);
            }
        }
        
        //i filter out the longest string from the results list.
        String longestString = "";
        for (String str : results) {
            if (str.length() > longestString.length()) {
                longestString = str;
            }
        }
        return longestString;
    }
}