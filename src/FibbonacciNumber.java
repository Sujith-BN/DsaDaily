public class FibbonacciNumber {

        public int fib(int n) {
            int a = 0;
            int b = 1;

            while(n>0){
                int next = a+b;
                a=b;
                b=next ;

                n--;
            }
            return a;



        }
    }

