import java.util.ArrayList;

public class linearsearch {
    static ArrayList<Integer> newArr = new ArrayList<>();
    public static void main(String[] args) {
        int[] arr = {1,3,4,3,6,7,3};
        ArrayList<Integer> indices = findAllIndex(arr,3,0,new ArrayList<>());
        System.out.println(indices);
    }
    private  static ArrayList findAllIndex(int[] arr,int target,int index,ArrayList<Integer> result){
        if(index == arr.length){
            return result;
        }
        if(arr[index]==target){
            newArr.add(index);
        }
       return findAllIndex(arr,target,index+1,result);
    }




    static boolean ls(int[] arr,int target, int index){
        if(index==arr.length){
            return false;
        }
        return arr[index]==target || ls(arr,target,index+1);
    }




}
