public class allocateMinimumPages {
    public static void main(String[] args) {

    }

    public static int findPages(int[] books, int students){

        if(books.length < students){
            return -1;
        }
        int start = Integer.MIN_VALUE;
        int end = 0;

        for(int i=0; i<books.length;i++){
            if(books[i]>start){
                start = books[i];
            }
            end = end + books[i];
        }
        int res = -1;

        while(start<=end){
            //max pages that can  be allocated to single element
            int mid = start + (end - start)/2;
            if(isAllocationPossible(books,mid,students)){
                res = mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return res;

    }





    public static boolean isAllocationPossible(int books[] , int maxPages, int students){
        int currentStudent = 1;
        int pages = 0;
        for(int i=0;i<books.length;i++){
            pages+=books[i];
            //if pages exceed maxPages
            if(pages>maxPages){
                //allocate to next student
                currentStudent+=1;
                pages = books[i];
            }
            if(currentStudent>students){
                return false;
            }
        }return true;
    }
}
