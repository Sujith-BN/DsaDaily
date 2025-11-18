public class ValidPerfectSquare {
        public boolean isPerfectSquare(int num) {
            if(num==1) return true;

            long i = 2 ;
            while(i*i<=num){
                long mul = i * i ;
                if(mul==num){
                    return true;
                }
                i++;
            }
            return false;

        }
    }


