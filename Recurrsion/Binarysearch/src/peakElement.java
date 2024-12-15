public class peakElement {
    public static void main(String[] args) {
        int[] arr = { 0,2,1,0};
        int ans = peakElement(arr);
        System.out.println(ans);

    }

    static int peakElement(int[] arr){
        int start =  0 , end = arr.length - 1;
        int mid  = -1;

        while(start<=end){
             mid = start + (end - start)/2;

            if(arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1]){
                return mid;
            } else if (arr[mid]<arr[mid+1]) {
                start = mid;
            }else{
                end = mid;
            }
        }

        return mid;
    }
}
