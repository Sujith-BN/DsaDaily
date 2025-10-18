import java.util.HashMap;
import java.util.Map;
public class MajorityElement {
        public int majorityElement(int[] nums) {
            if(nums.length==1)return nums[0];
            Map<Integer,Integer> map = new HashMap<>();
            int max =0;
            int majority=nums[0];

            for(int i = 0 ; i <nums.length ;i++){
                int freq =map.getOrDefault(nums[i],0);
                map.put(nums[i],freq+1);

            }
            for(int i = 0 ; i <nums.length ;i++){
                if(map.get(nums[i])>max){
                    max=map.get(nums[i]);
                    majority=nums[i];
                }
            }

            return majority;
        }
    }

