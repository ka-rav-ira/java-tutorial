public class reverseString {
    public static void main(String[] args) {
        reverseString2("abcdefgh");
    }

//    public static String reverseString(String s){
//        String arr[] = s.split(" ");
//        String res = "";
//        for(int i= arr.length-1;i>=0;i--){
//            if(arr[i].length()==0){
//                continue;
//            }
//
//            if(res.length()==0){
//                res+=arr[i];
//            }else{
//                res+=" "+arr[i];
//            }
//        }
//        return res;
//    }

    public static void reverseString2(String s){
        String ans = "";
        int n = s.length();
        for(int i=0;i<n;i++){
            ans = s.charAt(i) + ans;
        }
        System.out.println(ans);
    }
}
