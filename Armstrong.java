import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        boolean result = arms(num);
        System.out.println(result);

    }

    private static boolean arms(int num) {
        int sum = 0;
        int original = num;
        while(num>0) {
            int digit = 0;
            digit = num % 10;
            sum = sum + (digit * digit * digit);
            num = num/10;
            digit = 0;
        }

        if(original==sum){
            return true;
        }
        return false;
    }
}
