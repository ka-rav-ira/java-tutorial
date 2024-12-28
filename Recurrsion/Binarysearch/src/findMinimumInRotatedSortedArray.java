public class findMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        System.out.println(minimumValue(arr));
    }

    public static int minimumValue(int[] arr){
        int start = 0, end = arr.length-1;
        int min = Integer.MAX_VALUE;

        while(start<=end){

            if(start>end){
                return min;
            }

            int mid = start + (end-start)/2;

            min = Math.min(arr[mid],min);

            if(arr[end]<arr[start]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }

        return min;
    }
}
