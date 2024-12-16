import java.util.ArrayList;
import java.util.HashSet;

public class RevisionD3 {
    public static void main(String[] args) {

    }

    //Q1. Find Kth Positive Missing Number
    static int findKthPositive(int[] arr , int k){
        int start = 0 , end = arr.length;

        while(start<end){
            int mid = start + (end-start)/2;

            if(arr[mid]-(mid+1)<k){
                start = mid+1;
            }else{
                end = mid;
            }

        }
        return start + k;
    }

    //Q2. Intersection of Two Arrays
    public int[] intersection(int[] nums1,int nums2[]){
        HashSet<Integer> set = new HashSet<>();
        for(int n1:nums1){
            set.add(n1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int n2:nums2){
            if(set.contains(n2)){
                list.add(n2);
                set.remove(n2);
            }
        }

        int[] retArr = new int[list.size()];
        for(int i=0;i<retArr.length;i++){
            retArr[i] = list.get(i);
        }
        return retArr;
    }

//    Q3.Count Negative in a Sorted 2D Array

    static public int countNegative(int[][] grid){
        int count = 0 , rows = grid.length;

        for(int i=0;i<rows;i++){
            int start = 0 , end = grid[i].length;

            while(start<end){
                int mid = start + (end - start)/2;

                if(grid[i][mid]<0){
                    count = count + (end-mid);
                    end = mid; // for finding the first negative Element
                }else {
                    start = mid+1;
                }
            }
        }
        return count;
    }

//    Q4. Peak Index in a Mountain Array

    static int peakIndex(int[] arr){
        int start = 0 , end = arr.length , mid = -1;

        while(start<end){
            mid = start + (end - start)/2;

            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                return mid;
            } else if (arr[mid]<arr[mid+1]) {
                start = mid+1;
            }else {
                end = mid;
            }
        }
        return mid;
    }

//    Q5.Search Insert Position

    static int searchInsert(int[] arr, int target){
        
    }



}
