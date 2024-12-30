public class lc774bruteGAs {
    public static void main(String[] args) {

    }
    //this is a brute force solution
    public static double minimizeMaxDistance(int[] arr,int k){
        int n = arr.length;
        int[] howMany = new int[n-1];

        //pick and place k gas stations
        for(int gasStations = 1;gasStations<=k;gasStations++){
            //find the maximum section
            // and insert the gas station
            double maxSection = -1;
            int maxInd = -1;
            for(int i=0;i<n-1;i++){
                double diff = arr[i+1]-arr[i];
                double sectionLength = diff/(double)(howMany[i]+1);

                if(sectionLength>maxSection){
                    maxSection = sectionLength;
                    maxInd = i;
                }
            }
            //insert the current gas station
            howMany[maxInd]++;
        }

        //find the maximum distance i.e. the answer
        double maxAns = -1;
        for(int i = 0; i<n-1;i++){
            double diff = arr[i+1] - arr[i];
            double sectionLength  = diff/(double)(howMany[i]+1);
            maxAns=Math.max(maxAns,sectionLength);
        }
        return maxAns;
    }
}
