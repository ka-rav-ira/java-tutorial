import java.util.HashMap;

public class printUniqueElementInArray {

    public static int countSetBits(int num){
        int count = 0 ;
        while(num>0){
            count+=(num&1);
            num>>=1;
        }
        return count;
    }

    public static int findUniqueElementUsingHashMap(int[] arr,int t){
        HashMap<Integer,Integer> bitCountMap = new HashMap<>();

        for(int num : arr){
            int setBits = countSetBits(num);
            bitCountMap.put(num,bitCountMap.getOrDefault(num,0)+setBits);
        }

        for(int key: bitCountMap.keySet()){
            if(bitCountMap.get(key) % t!=0){
                return key;
            }
        }

        return 0;
    }


    public static int findUniqueElement(int[] arr,int t){
        int INT_SIZE = 32;
        int[] bitCount = new int[INT_SIZE];

        for(int num:arr){
            for(int i=0;i<INT_SIZE;i++){
                bitCount[i]+=(num>>i) &1;
            }
        }

        int result = 0;
        for(int i=0;i<INT_SIZE;i++){
            if(bitCount[i]%t!=0){
                result |= (1<<i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {6,2,6,6,2,2,5};
        int t = 3;
        System.out.println(findUniqueElementUsingHashMap(arr,t));
    }


}
