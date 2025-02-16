public class printBitsOfNo {
    public static void main(String[] args) {
//        printBits(35);
//        oddOrEven(36);
//        setIthBit(32,4);
        toggleIthBit(32,4);
    }

    public static void printBits(int num){
        for(int i=7;i>=0;i--){
            System.out.print((num>>i)&1);
        }
    }

    public static void oddOrEven(int num){
        if((num&1)==1){
            System.out.println("Odd");
        }else{
            System.out.println("Even");
        }
    }

    public static void setIthBit(int num,int pos){
        int result = num|(1<<pos);
        System.out.println(result);
    }

    public static void toggleIthBit(int num,int pos){
        System.out.println(num^(1<<pos));
    }

    public static void unsetTheBit(int num,int pos){
        System.out.println(num&(~(1<<pos)));
    }
}
