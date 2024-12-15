public class countnegativeInSortedArray {
    public static void main(String[] args) {
        int[][] arr = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int count = cNegative(arr);
        System.out.println(count);
    }

    static int cNegative(int[][] grid){

        int count = 0;
        int rows = grid.length;

        for(int i= 0;i<rows;i++){
            int start = 0 , end = grid[i].length;

            while(start<end){
                int mid = start + (end - start)/2;

                if(grid[i][mid]<0){
                    count = count + (end-mid);
                    end = mid ;
                }else{
                    start = mid +1;
                }
            }
        }
        return count;
    }
}
