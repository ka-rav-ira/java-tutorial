import java.util.Arrays;

public class findFirstLastPosition {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 6;

        System.out.println(Arrays.toString(searchRange(arr,target)));
    }

    static int[] searchRange(int[] arr ,int target){
        int start = 0 ,  end= arr.length - 1;

        int[] newarr = new int[2];
        newarr[0] = findFirst(arr,target);
        newarr[1] = findLast(arr,target);
        return newarr;
    }

    private static int findFirst(int[] arr, int target){
        int start = 0 , end = arr.length-1;
        int idx = -1;

        while(start<=end){

            int mid = start + (end-start)/2;

            if(arr[mid]<=target){
                start = mid+1;
            }else{
                end = mid-1;
            }

            if(arr[mid]==target) {
                idx = mid;
            }
        }
        return idx;
    }

    private static int findLast(int[] arr , int target){
        int start = 0 , end = arr.length - 1;
        int idx = -1;

        while(start<=end){

            int mid = start + (end-start)/2;

            if(arr[mid]>=target){
                end = mid -1;
            }else{
                start = mid+1;
            }

            if(arr[mid]==target){
                idx = mid;
            }
        }
        return idx;
    }


}
