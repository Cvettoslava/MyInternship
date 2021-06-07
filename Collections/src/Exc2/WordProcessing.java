package Exc2;

import org.w3c.dom.Text;

import java.util.*;

public class WordProcessing {


    /** Finds the frequency of occurrence of each word in the text.
     *  @param text is the provided text where we have to search.*/
    public void FindingWordFrequency (String text){

        text = text.toLowerCase().replaceAll("[^a-z ]", "");
        ArrayList<String> arr = new ArrayList<String>();
        String[] sentarr = text.split(" ");
        Map<String, Integer> a = new HashMap<String, Integer>();
        for (String word : sentarr) {
            arr.add(word);
        }
        for (String word : arr) {
            int count = Collections.frequency(arr, word);
            a.put(word, count);
        }
        for (String key : a.keySet()) {
            System.out.println("Count of '"+key+"' is : "+ " = " + a.get(key));
        }

        //Second option.
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text: ");
        String text = sc.nextLine();

        //String s = "this is a this is this a this yes this is a this what it may be i do not care about this";
        String a[] = text.split(" ");
        Map<String, Integer> words = new HashMap<>();
        for (String str : a) {
            if (words.containsKey(str)) {
                words.put(str, 1 + words.get(str));
            } else {
                words.put(str, 1);
            }
        }
        System.out.println(words);*/


    }

     /** Finds the letter that is most common in a sentence.
      * @param str is provided string we are going to search from.
      * @param skipSpaces is a bool variable that says is skip spaces or not.
      * @return the List of the most common letters in the string.*/
    public List<Character> maximumOccurringChars(String str, Boolean skipSpaces) {
        Map<Character, Integer> map = new HashMap<>();
        List<Character> occurrences = new ArrayList<>();
        int maxOccurring = 0;

        // creates map of all characters
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (skipSpaces && ch == ' ')      // skips spaces if needed
                continue;

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }

            if (map.get(ch) > maxOccurring) {
                maxOccurring = map.get(ch); // saves max occurring
            }
        }

        // finds all characters with maxOccurring and adds it to occurrences List
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxOccurring) {
                occurrences.add(entry.getKey());
            }
        }

        return occurrences;
    }
    public List<Character> maximumOccurringChars(String str) {
        return maximumOccurringChars(str, false);
    }
}
