import java.util.*;
public class LongestCommonPrefix {
        public static String longestCommonPrefix(String[] strs) {

            Arrays.sort(strs);
            int size = strs.length;
            String str= "";
            String firstWord =strs[0];
            String lastWord =strs[size-1];
            boolean isMatched = false;
            for(int i =0 ; i<firstWord.length();i++){
                if(firstWord.charAt(i)==lastWord.charAt(i)){
                    isMatched =true;
                    str=str+String.valueOf(firstWord.charAt(i));
                }
                else break;
            }
            if(isMatched==true){
                return str;
            }
            else return "";
        }

    static void main() {
        System.out.println(longestCommonPrefix(new String[]{"clap","claims","class"}));
    }
}



