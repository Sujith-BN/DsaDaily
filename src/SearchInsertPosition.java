import java.util.*;
public class SearchInsertPosition {
        public int searchInsert(int[] nums, int target) {
            int count = 0 ;
            if(target==0 ){
                for(int i = 0 ; i < nums.length ; i++){
                    if(nums[i]<0){
                        count++;
                    }

                }
                if(count>0){
                    return count;
                }
                else{
                    return 0;

                }

            }
            else if(nums.length<=1 && nums[0]>target){
                return 0;
            }
            else if(target>nums[nums.length-1]){
                return nums.length ;
            }
            for(int i = 0 ; i < nums.length; i++){
                if(target==nums[i]){
                    return i ;
                }
            }

            ArrayList<Integer> list = new ArrayList();
            for(int i=0 ; i <nums.length;i++){
                if(nums[i]>target){
                    list.add(target);
                    list.add(nums[i]);

                    break;
                }
                else{
                    list.add(nums[i]);
                }


            }
            int arr[]=new int[list.size()-1];
            for(int i = 0 ; i<list.size()-1;i++){
                arr[i]=list.get(i);
            }
            for(int i = 0; i <arr.length ; i ++){
                if(arr[i]==target){
                    return i;
                }
            }
            return 0;

        }

//          Optimal solution
//        public int searchInsert(int[] nums, int target) {
//            int left = 0, right = nums.length - 1;
//
//            while (left <= right) {
//                int mid = left + (right - left) / 2;
//
//                if (nums[mid] == target) return mid;
//                else if (nums[mid] < target) left = mid + 1;
//                else right = mid - 1;
//            }
//
//            return left; // insert position
//        }


}

