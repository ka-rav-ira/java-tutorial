public class printUniqueElementoFArray {
    public static void main(String[] args) {
        int[] arr = {2,4,2,6,3,3,1,1,6};
        System.out.println(FindUnique(arr));
    }

    public static int FindUnique(int[] arr){

        int el=0;
        for(int i=0;i<arr.length;i++){
            el^=arr[i];
        }

        return el;
    }
}
