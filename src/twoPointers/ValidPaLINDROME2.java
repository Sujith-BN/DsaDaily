package twoPointers;

public class ValidPaLINDROME2 {
    public boolean checkPalindrome(int i , int j , String s){
            while(i<j){
                char a = s.charAt(i);
                char b = s.charAt(j);
                if(a!=b){
                    return false;
                }
                i++;
                j--;
            }
            return true;

        }
        public boolean validPalindrome(String s) {


            int i  = 0 ,
                    j = s.length() - 1;

            while(i<j){
                char a = s.charAt(i);
                char b = s.charAt(j);
                if(a!=b){
                    return checkPalindrome(i+1,j,s) || checkPalindrome(i,j-1,s);
                }
                else{
                    i++;
                    j--;
                }

            }
            return true;

        }

    }

