public class agnoisticbs {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7};
        int[] decarr = {7,6,5,4,3,2,1};
        int ans = agonistic(arr,7);
        int decans = agonistic(decarr,7);
        System.out.println(ans);
        System.out.println(decans);
    }

    static int agonistic(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        boolean asc = (arr[start]<arr[end]);

        while(start<=end){

            int mid = start+(end - start)/2;
            if(arr[mid]==target){
                return mid;
            }

            if(asc){
                 if (target<arr[mid]) {
                    end = mid-1;
                }else{
                    start=mid+1;
                }
            }else{
                if(target<arr[mid]){
                    start=mid+1;
                }else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}
