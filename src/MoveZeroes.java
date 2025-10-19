public class MoveZeroes {
        public void moveZeroes(int[] nums) {
            if(nums.length==1){
                System.out.print(nums[0]);
            }
            int j =0;
            for(int i = 0 ; i < nums.length ; i++){
                if(nums[i]!=0){
                    nums[j++] =nums[i];
                }

            }
            while(j<nums.length){
                nums[j++]=0;
            }


        }
    }

