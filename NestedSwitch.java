import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empId = in.nextInt();
        String department = in.next();

        switch (empId){
            case 1:
                System.out.println("Kunal K");
                break;
            case 2:
                System.out.println("Rahul R");
                break;
            case 3:
                System.out.println("Emp Number 3");
                switch (department){
                    case "IT" -> System.out.println("IT departmemt");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No Department Entered");
                }
            default:
                System.out.println("Enter Correct Empid");
        }


    }
}
