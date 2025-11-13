package twoPointers;

public class ValidPalindrome {
        public boolean isPalindrome(String s) {

            int left = 0 ,
                    right = s.length()-1;

            while(left<right){
                char i  = s.charAt(left),
                        j = s.charAt(right);

                if(!Character.isLetterOrDigit(i)){
                    left++;
                    continue;
                }
                if(!Character.isLetterOrDigit(j)){
                    right--;
                    continue;
                }
                if (Character.toLowerCase(i) != Character.toLowerCase(j)) {
                    return false;
                }
                left++;
                right--;


            }
            return true;

        }

    }

