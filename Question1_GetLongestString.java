import java.util.ArrayList;
import java.util.List;

public class Question1_GetLongestString {
    public static void main(String[] args) {

        // Here i have used a list to add sample strings just like one  provided in the question example.
        List<String> strings = new ArrayList<>();
        strings.add("AABCDA");
        strings.add("ABCDZADC");  
        strings.add("ABCDBCA");
        strings.add("ABCDABDCA");

       //Here i have instantiated a list that will have the intended output or result.
       List<String> results = new ArrayList<>();
        for (String str: strings) {
            //Here i am checking whether the list contains the required characters and whether is has no repetitive characters.
            //if it passes both checks then i add it tp the results list.
            String validString = (!getValidString(str).isEmpty() && getStringWithNonRepetitive(str)) ? str : "";
            results.add("\"" + validString + "\"");
        }
        System.out.println("Valid Strings are: " + String.join(",", results));
        
        String longest = getLongestString(results);
        System.out.println("Longest Valid String is: \"" + longest + "\"");
    }
    // This function checks if the string contains the characters in the regex
    public static String getValidString(String str){
        String validCharacters = "[ABCD]+";
        if (str.matches(validCharacters)){
            return str;
        }
        return "";
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
    // Here i am getting the longest string from the list of valid strings.
    public static String getLongestString(List<String> strings) {
        String longestString = "";
        for (String str : strings) {
            if (str.length() > longestString.length()) {
                longestString = str;
            }
        }
        return longestString;
    }
}
