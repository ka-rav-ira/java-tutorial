import java.util.HashMap;

public class Majorityelement {
    public static void main(String[] args) {
        int[] array = {2,2,1,1,1,2,2};
        int element = majority(array);
        System.out.println(element);
    }

//    private static int majority(int[] array) {
//        HashMap<Integer, Integer> hashMap = new HashMap<>();
//
//        for(int num: array){
//            if(hashMap.containsKey(num)){
//                int currentCount = hashMap.get(num);
//                hashMap.put(num, currentCount+1);
//            }else{
//                hashMap.put(num,1);
//            }
//        }
//
//        int majorityElement = - 1;
//        int majorityCount = array.length/2;
//        for(Integer key: hashMap.keySet()){
//            if(hashMap.get(key)>majorityCount){
//                majorityElement = key;
//                break;
//            }
//        }
//        return majorityElement;
//    }

    private static int majority(int[] array){
        int majority = array[0] ;
        int votes = 1;

        for(int i=1;i<array.length;i++){

            if(votes==0){
                votes++;
                majority = array[i];
            }else if(majority==array[i]){
                votes++;
            }else{
                votes--;
            }
        }
        return majority;
    }


}
