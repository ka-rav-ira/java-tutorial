public class SetMatrixZeroes {

    public static void setZeroes(int[][] matrix){
        boolean firstRow = false,firstCol = false;

        //setting markers in the first row and the coloumn by traversing inside the sub matrix
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    if(i==0) firstRow = true;
                    if(j==0) firstCol = true;
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }

        //Replacing the innner matrix
        for(int i=1;i< matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }

        //Last Remaining CHecks
        if(firstRow){
            for(int j=0;j<matrix[0].length;j++){
                matrix[0][j]=0;
            }
        }

        if(firstCol){
            for(int i=0;i< matrix.length;i++){
                matrix[i][0]=0;
            }
        }



    }
}
