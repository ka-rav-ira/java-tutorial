import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
//        sum();
//
//        String Message = greet();
//        System.out.println(Message);

//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter Numeber 1");
//        int num1 = in.nextInt();
//        System.out.println("Enter Number 2");
//        int num2 = in.nextInt();
//
//        int ans = sum3(num1,num2);
//        System.out.println("The sum is = " + ans);

        String personalized = myGreet("Vaibhav Singh");
        System.out.println(personalized);

    }

    private static String myGreet(String name) {
        String message = "Hello" + name;
        return message;
    }


//    static void sum(){
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter Number 1");
//        int num1 = in.nextInt();
//        System.out.println("Enter Number 2");
//        int num2 = in.nextInt();
//        int sum = num1 + num2;
//        System.out.println("The sum is = "+sum);
//    }
//
//    static String greet(){
//        String greeting = "how are you";
//        return greeting;
//    }

    static int sum3(int a,int b){
        int sum = a + b;
        return sum;
    }
}
