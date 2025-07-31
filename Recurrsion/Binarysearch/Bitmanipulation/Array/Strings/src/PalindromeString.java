import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String res = sc.nextLine();
        boolean ans = isPalindrome(res);
        System.out.println("Is the string a palindrome? " + ans);
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        int start = 0, end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}