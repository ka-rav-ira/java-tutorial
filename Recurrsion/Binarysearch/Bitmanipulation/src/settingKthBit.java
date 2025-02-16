public class settingKthBit {
    public static void main(String[] args){
        System.out.println(set(147,4));
    }

    public static int set(int n,int k){
        return (n|(1<<k-1));
    }
}
