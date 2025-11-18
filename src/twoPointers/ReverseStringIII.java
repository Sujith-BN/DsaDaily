package twoPointers;

public class ReverseStringIII {
        public String reverseWords(String s) {

            StringBuilder sb = new StringBuilder(s);
            int n = sb.length();

            int i = 0;

            while(i < n) {

                int j = i;


                while(j < n && sb.charAt(j) != ' ') {
                    j++;
                }

                int start = i;
                int end = j - 1;


                while(start < end){
                    char a = sb.charAt(start);

                    sb.setCharAt(start, sb.charAt(end));
                    sb.setCharAt(end, a);

                    start++;
                    end--;
                }

                i = j + 1;
            }

            return sb.toString();
        }
    }


