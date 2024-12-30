import java.util.ArrayList;
import java.util.Collections;

public class bruteAllocateMinimumPages {
    public static void main(String[] args) {

    }

    public static int countStudents(ArrayList<Integer> arr, int pages){
        int students = 1;
        int pagesStudent = 0;

        for(int book:arr){
            if(pagesStudent+book>pages){
                students++;
                pagesStudent=book;
            }else{
                pagesStudent+=book;
            }
        }
        return students;
    }


    public static int findPages(ArrayList<Integer> arr, int n, int m){
        if(m>n){
            return -1;//Not Enough Books For Students
        }

        int low = Collections.max(arr);
        int high = arr.stream().mapToInt(Integer::intValue).sum();

        for(int pages = low; pages<=high; pages++){
            if(countStudents(arr,pages)==m){
                return pages;
            }
        }
        return low;
    }
}
