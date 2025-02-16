public class characterConversion {
    public static void main(String[] args){

    }


    public static char convertCharToUpperCase(int num){
        return (char)(num&~(1<<5));
    }

    public static char convertCharToLowerCase(int num){
        return (char)(num|(1<<5));
    }
}
