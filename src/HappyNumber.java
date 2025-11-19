import java.util.HashSet;

public class HappyNumber {
        public boolean isHappy(int n) {
            HashSet<Integer> visited = new HashSet<>();

            while (n != 1) {
                if (visited.contains(n)) return false;
                visited.add(n);

                int sum = 0;
                while (n > 0) {
                    int digit = n % 10;
                    sum += digit * digit;
                    n /= 10;
                }

                n = sum;
            }

            return true;
        }
    }


