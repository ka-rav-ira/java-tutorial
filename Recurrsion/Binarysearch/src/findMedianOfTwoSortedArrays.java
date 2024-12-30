import java.util.ArrayList;
import java.util.List;

public class findMedianOfTwoSortedArrays {
    public static void main(String[] args) {

    }

    public static double median(int[] a, int[] b){
        int n1 = a.length;
        int n2 = b.length;

        List<Integer> arr3 = new ArrayList<>();
        int i = 0 , j = 0 , k=0;
        while(i<n1 && j<n2){
            if(a[i]<b[j]){
                arr3.add(a[i++]);
            }else{
                arr3.add(b[j++]);
            }
        }

        while(i<n1){
            arr3.add(a[i++]);
        }
        while(j<n2){
            arr3.add(b[j++]);
        }

        //finding the median

        int n = n1+n2;
        if(n%2==1){
            return (double) arr3.get(n/2);
        }
        double median = ((double) arr3.get(n/2)+(double) arr3.get((n/2)-1))/2.0;
        return median;
    }
}
