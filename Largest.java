import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        int max = num1;

        if(num2>max){
            max = num2;
        }else if(num3>max){
            max = num3;
        }else{
            max = num1;
        }

        System.out.println("The largest Number is = " + max);
    }

}
