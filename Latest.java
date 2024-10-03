import java.sql.Array;
import java.util.Scanner;

public class Latest {

    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int limit1 = sc.nextInt();
        int limit2 = sc.nextInt();
        int averageOf = average(arr,limit1,limit2);
        System.out.println(averageOf);
    }

    private static int average(int[] arr, int limit1, int limit2) {
        int count = 0;
        int i=0;
        int sum = 0 ;
        while(i<arr.length){
            if(arr[i]>limit1 && arr[i]<limit2){
                sum+= arr[i];
                count++;
                i++;
            }
            else{
                i++;
            }
        }
        return (sum)/count;
    }

}
