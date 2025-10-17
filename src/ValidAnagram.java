import java.util.Arrays;

public class ValidAnagram {

        public static boolean isAnagram(String s, String t) {
            char s1[] = s.toCharArray();
            char s2[] = t.toCharArray();

            Arrays.sort(s1);
            Arrays.sort(s2);
            return Arrays.equals(s1,s2);

        }

    static void main() {
        System.out.println(isAnagram("madam","adamm"));
    }
    }

