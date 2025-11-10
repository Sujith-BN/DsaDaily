import java.util.Arrays;

public class SquareOfSortedArrya {
        public int[] sortedSquares(int[] nums) {

            for(int i  = 0 ; i < nums.length ; i++){
                int num = nums[i];
                nums[i] = num*num;
                num = 0;
            }
            Arrays.sort(nums);

            return nums;

        }
    }

