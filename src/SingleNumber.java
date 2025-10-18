import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

        public int singleNumber(int[] nums) {
            int index =-1;
            Map<Integer,Integer> map = new HashMap<>();
            for(int i = 0 ; i  <nums.length ; i++){
                int freq = map.getOrDefault(nums[i],0);
                map.put(nums[i],freq+1);
            }
            for(int i = 0 ; i <nums.length ; i++){
                if(map.get(nums[i])==1){
                    index = nums[i];
                    break;
                }
            }

            return index;
        }
    }

