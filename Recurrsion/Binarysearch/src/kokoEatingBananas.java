public class kokoEatingBananas {
    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        int hrs = 8;
        System.out.println(minEatingSpeed(piles,hrs));
    }

    public static int minEatingSpeed(int[] piles,int h){
       int minSpeed = 1;
        int maxSpeed = 0 ;
        for(int n:piles){
            maxSpeed=Math.max(maxSpeed,n);
        }

        while(minSpeed<maxSpeed){
            int mid = minSpeed + (maxSpeed - minSpeed)/2;

            if(canEatInTime(piles,h,mid)){
                maxSpeed = mid;
            }else{
                minSpeed = mid+1;
            }

        }
        return minSpeed;
    }

    public static boolean canEatInTime(int[] arr,int h,int mid){
        int hrs = 0;
        for(int pile:arr){
            hrs += (int)Math.ceil((double) pile/mid);
        }
        return hrs<=h;
    }
}
