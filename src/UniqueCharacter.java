import java.util.HashMap;
import java.util.Map;
public class UniqueCharacter {
        public static int firstUniqChar(String s) {
            Map<Character,Integer> freqMap = new HashMap<>();
            int index = -1;
            for(int i = 0 ; i <s.length() ; i++){
                char letter = s.charAt(i);
                int freq= freqMap.getOrDefault(letter,0);
                freqMap.put(letter,freq+1);
            }
            for(int i = 0 ; i < s.length() ; i++){
                if(freqMap.get(s.charAt(i) )==1){

                    index = i ;
                    break;
                }
            }
            return index;
        }

    static void main() {
        System.out.println(firstUniqChar("loveleetcode"));
    }
    }

