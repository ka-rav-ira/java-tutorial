import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountSubarrayswithsumk {
    public static void main(String[] args) {

    }
    public int solve(ArrayList<Integer> A, int B) {
        int n = A.size();
        int xr = 0;
        Map<Integer,Integer> mpp = new HashMap<>();
        mpp.put(xr,1);
        int cnt = 0;

        for(int i=0;i<n;i++){
            xr = xr^A.get(i);

            int x = xr^B;

            if(mpp.containsKey(x)){
                cnt+=mpp.get(x);
            }

            if(mpp.containsKey(xr)){
                mpp.put(xr,mpp.get(xr)+1);
            }else{
                mpp.put(xr,1);
            }
        }
        return cnt;
    }
}


