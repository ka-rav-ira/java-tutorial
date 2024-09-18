import java.util.Arrays;

import static java.util.Collections.swap;

public class MoveZeroesToEnd {
    public static  void main(String[] args){
        int[] arr = {1,0,2,3,0,4,0,1};
        removeZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

     static void removeZeroes(int[] arr) {
        int temp = 0;
        int n = arr.length;
        for(int i = 0;i<=n-1;i++){
            if(arr[i]==0){
                temp = i;
            }
        }
        int i = temp;int j=i+1;
        while(i<j){
            if(arr[j]!=0){
                swap(arr[i],arr[j]);
                i=j;
                j=i+1;
            }
        }
    }

    static  void swap(int i,int j){
        int temp = i;
        i=j;
        j=temp;
    }


}
