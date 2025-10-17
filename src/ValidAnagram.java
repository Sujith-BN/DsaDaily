import java.util.Arrays;

public class ValidAnagram {

        public static boolean isAnagram(String s, String t) {
            char s1[] = s.toCharArray();
            char s2[] = t.toCharArray();

            Arrays.sort(s1);
            Arrays.sort(s2);
            return Arrays.equals(s1,s2);
     //       Optimal one
//            int arr[] = new int[26];
//            String str = s.replaceAll(" ","").toLowerCase();;
//            String str2 = t.replaceAll(" ","").toLowerCase();
//
//            for(int i = 0 ; i < str.length() ; i++){
//                arr[str.charAt(i)-'a']++;
//            }
//            for(int i = 0 ; i < str2.length() ; i++){
//                arr[str2.charAt(i)-'a']--;
//            }
//            for(int count :arr){
//                if(count!=0)
//                    return false;
//            }
//            return true;

        }

        }


    static void main() {
        System.out.println(ValidAnagram.isAnagram("madam","adamm"));
    }


