import java.util.*;
public class WordPattern {
        public static boolean wordPattern(String pattern, String s) {
            String[] words = s.split(" ");


            if (pattern.length() != words.length) {
                return false;
            }

            Map<Character, String> map = new HashMap<>();
            Set<String> usedWords = new HashSet<>();

            for (int i = 0; i < pattern.length(); i++) {
                char c = pattern.charAt(i);
                String word = words[i];

                if (map.containsKey(c)) {

                    if (!map.get(c).equals(word)) {
                        return false;
                    }
                } else {

                    if (usedWords.contains(word)) {
                        return false;
                    }
                    map.put(c, word);
                    usedWords.add(word);
                }
            }

            return true;
        }

    static void main() {
        System.out.println(wordPattern("aaaa","dog dog dog dog"));
        System.out.println(wordPattern("aaaa","dog dog dog cat"));
    }
    }


