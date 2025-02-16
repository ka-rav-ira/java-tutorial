import java.util.Arrays;

public class printUniqueElementsWhichAppearOnlyOnceOtherAppearsEvenNumberTimes {

    public static int[] findTwoUniqueNumbers(int[] arr){
        int xor = 0;

        for(int num:arr){
            xor^=num;
        }

        int mask = xor & -xor;

        int x = 0, y=0;
        for(int num:arr){
            if((num&mask)==0){
                x^=num;
            }else{
                y^=num;
            }
        }

        return new int[] {x,y};


    }



    public static void main(String[] args) {
        int[] arr = {4,7,4,9,7,10};
        int[] result = findTwoUniqueNumbers(arr);
        System.out.println(Arrays.toString(result));
    }
}
