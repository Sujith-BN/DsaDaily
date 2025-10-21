import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Anagram2273 {
        public List<String> removeAnagrams(String[] words) {
            List<String> result = new ArrayList<>();
            String prevSorted = "";

            for (String word : words) {

                char[] chars = word.toCharArray();
                Arrays.sort(chars);
                String sorted = new String(chars);


                if (!sorted.equals(prevSorted)) {
                    result.add(word);
                    prevSorted = sorted;
                }
            }

            return result;
        }
    }

