public class findCompany {
    public static void main(String[] args) {
        String name1 = "vaibhav@gmail.com";
        String emailArr[] = name1.split("@");
        String lastPart = emailArr[emailArr.length-1];
        int dotIndex = lastPart.lastIndexOf(".");
        System.out.println(lastPart.substring(0,dotIndex));
    }
}
