package twoPointers;

public class FindNumbers {
    public int findNumbers(int[] nums) {
            int size = nums.length;
            int i  = 0 ;
            int count = 0;
            int remember = 0;

            while(i<size){
                int num =  nums[i];

                while(num>0){
                    count++;
                    num/=10;
                }
                if(count%2==0){
                    remember++;
                }
                count = 0 ;
                i++;

            }

            return remember;


        }
    }

