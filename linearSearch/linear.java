package linearSearch;

public class linear {
    public static void main(String[] args) {
        int[] nums = {23,45,1,2,8,19,-3,16,-11,28};
        int target = 19;
        int ans = linearSearch(nums,target);
        System.out.println(ans);
    }

    //search in the array : return the index if item not found
    //otherwise if item not found return -1
    static int linearSearch(int[] nums, int target) {
        if(nums.length == 0){
            return -1;
        }

        //run a for loop

        for(int index = 0 ; index<nums.length;index++){
            //check for element in the array
            int element = nums[index];
            if(element==target){
                return index;
            }
        }

        //this will execute if none of the element not match
        return  -1;
    }
}
