public class SortedAndRotated {
        // public int[] rotate(int nums[]){
        //     int last = nums[nums.length -1];
        //     for(int i = nums.length -1 ; i > 0 ; i--){
        //         nums[i] = nums[i-1];

        //     }
        //     nums[0] = last;
        //     return nums;
        // int b[] = Arrays.copyOf(nums,nums.length);
        // Arrays.sort(b);
        // int size = nums.length;
        // while(size>-1){
        //     if(Arrays.equals(rotate(nums),b)) return true;
        //     size--;
        // }
        // return false;


        public boolean check(int[] nums) {

            int breakPoints = 0 ;

            if(nums[0]<nums[nums.length-1]){
                breakPoints++;

            }

            for(int i = 0 ; i < nums.length-1 ; i++){
                if(nums[i]>nums[i+1]) breakPoints++;
                if(breakPoints>1) return false;
            }
            return true;





        }
    }

