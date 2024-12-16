import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class findIntersection {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] arr  = intersection(nums1,nums2);
        System.out.println(Arrays.toString(arr));
    }

    static int[] intersection(int[] num1 , int[]num2){
//        ArrayList<Integer> newArr = new ArrayList<>();
        HashSet<Integer> newArr = new HashSet<>();

        for(int i = 0 ; i<num1.length;i++){
            for(int j = 0 ; j< num2.length;j++){
                if(num1[i]==num2[j]){
                    newArr.add(num1[i]);
                }
            }
        }


        return newArr.stream().mapToInt(Integer::intValue).toArray();


    }
}
