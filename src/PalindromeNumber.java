public class PalindromeNumber {
        public  static boolean isPalindrome(int x) {
            int n = x;
            int reverseNumber = 0 ;
            while(x>0){
                reverseNumber = reverseNumber*10+(x%10);
                x=x/10;
            }
            return n==reverseNumber;
        }

    static void main() {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));

    }
    }

