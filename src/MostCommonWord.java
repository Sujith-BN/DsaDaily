import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MostCommonWord {
        public String mostCommonWord(String paragraph, String[] banned) {
            Set<String> ban = new HashSet<>();
            for(String b : banned){
                ban.add(b);
            }

            HashMap<String,Integer> map = new HashMap<>();

            String[] words = paragraph.toLowerCase().replaceAll("[^a-z]", " ").split("\\s+");

            for(String w : words){
                if(w.length() == 0) continue;
                if(ban.contains(w)) continue;
                map.put(w, map.getOrDefault(w, 0) + 1);
            }

            String result = "";
            int maxFreq = 0;

            for(Map.Entry<String,Integer> e : map.entrySet()){
                if(e.getValue() > maxFreq){
                    maxFreq = e.getValue();
                    result = e.getKey();
                }
            }

            return result;
        }


    }

