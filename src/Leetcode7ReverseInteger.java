class  Leetcode7ReverseInteger {
        public static int reverse(int x) {
            int  reversedNumber = 0 ;
            while(x!=0){
                int lastDigit = x%10;
                x=x/10;
                if (reversedNumber > Integer.MAX_VALUE / 10 ||
                        reversedNumber < Integer.MIN_VALUE / 10) {
                    return 0;
                }
                reversedNumber =reversedNumber*10+lastDigit;
            }
            return reversedNumber;
        }

    static void main() {
        System.out.println(reverse(123));
        System.out.println(reverse(-123));
    }
    }



