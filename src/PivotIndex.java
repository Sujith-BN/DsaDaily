public class PivotIndex {
        public int pivotIndex(int[] nums) {
            int rightSum = 0 ;
            for(int i = 0 ; i <nums.length ; i++){
                rightSum+=nums[i];
            }

            int leftSum = 0 ;
            for(int i = 0 ; i <nums.length ; i ++){
                int currVal = nums[i];
                rightSum-=currVal;
                if(leftSum == rightSum){
                    return i;
                }
                else{
                    leftSum += currVal;
                }

            }
            return -1;

        }
    }

