import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNumberOfCandies {
        public static boolean isGreater(int updated, int max) {
            return updated >= max;
        }
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            List<Boolean> result = new ArrayList<>();


            int max = 0;
            for (int c : candies) {
                if (c > max) max = c;
            }


            for (int i = 0; i < candies.length; i++) {
                int updated = candies[i] + extraCandies;
                result.add(isGreater(updated, max));
            }

            return result;
        }
    }


