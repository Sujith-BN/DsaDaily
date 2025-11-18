import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
        public List<String> fizzBuzz(int n) {
            List<String> list = new ArrayList<>();

            int i  = 1 ;

            while(n>0){
                if(i%3==0 && i%5==0){
                    list.add("FizzBuzz");
                }
                else if(i%3==0){
                    list.add("Fizz");
                }
                else if(i%5==0){
                    list.add("Buzz");
                }
                else{
                    list.add(String.valueOf(i));
                }

                n--;
                i++;

            }
            return list;




        }
    }

