import java.util.HashSet;
public class LongestSubString {
        public int lengthOfLongestSubstring(String s) {
            int n = s.length();
            int left = 0, right = 0;
            int maxLen = 0;
            HashSet<Character> set = new HashSet<>();

            while (right < n) {
                char c = s.charAt(right);
                while (set.contains(c)) {
                    set.remove(s.charAt(left));
                    left++;
                }
                set.add(c);
                maxLen = Math.max(maxLen, right - left + 1);
                right++;
            }

            return maxLen;
        }
    }


