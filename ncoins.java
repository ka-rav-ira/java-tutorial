public class ncoins {
    public static void main(String[] args) {
        int ans =  noOfRow(5);
        System.out.println(ans);
    }

     static int noOfRow(int n){

        int row = 0 ;
        int sum = n;



        for(int i = 1; i<=n ;i++){
            sum = sum - i;

            if(sum>0){
                row++;
            }
            else{
                return  row;
            }



        }
        return -1;
    }
}
