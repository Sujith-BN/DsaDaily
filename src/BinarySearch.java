public class BinarySearch {
    static void main() {
        int arr[] = {1,2,3,4,5,6,7};

        int left= 0;
        int right = arr.length -1;
        int target  = 7;

        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]==target){
                System.out.println(mid);
                break;
            }
            else if(arr[mid]<target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }



    }
}
