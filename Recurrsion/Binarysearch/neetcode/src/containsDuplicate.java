import java.util.HashMap;

public class containsDuplicate {

    public static void main(String[] args) {
        int[] newArr = {1,2,3};
        System.out.println(optimalDuplicate(newArr));
    }
//Brute Force Approach
    public static boolean duplicate(int[] arr){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    if(count>=1){
                        return true;
                    }
                }
            }
        }
        return  false;
    }

    //Optimal Approach

    public static boolean optimalDuplicate(int[] arr){
        HashMap<Integer,Boolean> map = new HashMap<>();

        for(int num:arr){
            if(map.containsKey(num)){
                return true;
            }
            map.put(num,true);
        }
        return false;
    }

    /// (1,true) (2,true) (3,true) (1,true)
}
