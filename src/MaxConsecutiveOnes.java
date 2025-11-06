public class MaxConsecutiveOnes {
        public int findMaxConsecutiveOnes(int[] nums) {
            int remember = 0 ;
            int max = 0 ;

            for(int i = 0 ; i < nums.length ;i++){
                if(nums[i]==1){
                    max++;
                }
                else{
                    if(max>remember){
                        remember = max;
                    }
                    max=0;
                }
            }
            if(max>remember) return max;

            return remember;

        }

    }

