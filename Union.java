import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Union {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,5,6};
        int n = arr1.length;

        int[] arr2 = {1,2,4,7,3};
        int m = arr2.length;

       ArrayList<Integer> result = findUnion(arr1,arr2,n,m);
       for(int it:result){
           System.out.print(it + " ");
       }

    }

    static ArrayList <Integer> findUnion(int arr1[],int arr2[], int n, int m){
        HashSet<Integer> s = new HashSet<>();
        ArrayList <Integer> Union = new ArrayList<>();
        for(int i = 0 ; i<n;i++){
            s.add(arr1[i]);
        }
        for(int i = 0 ; i<m;i++){
            s.add(arr2[i]);
        }

        for(int it:s){
            Union.add(it);
        }

        return Union;
    }
}
