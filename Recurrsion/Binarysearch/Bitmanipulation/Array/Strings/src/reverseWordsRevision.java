public class reverseWordsRevision {
    public static void main(String[] args) {

    }

    public static String ReverseWords(String S){
       if(S==null ||S.trim().isEmpty()){
           return "";
       }
        String[] arr = S.split(" ");
        StringBuilder res = new StringBuilder();
       for(int i=arr.length-1;i>=0;i--){
          if(!arr[i].isEmpty()){
              if(res.length()>0){
                  res.append(" ");
              }
              res.append(arr[i]);
          }
       }

        return res.toString();
    }

    public static String ReverseWordsOptimize(String S){
        StringBuilder res =  new StringBuilder();
        int startIndex = res.length()-1;

        while(startIndex>=0){
            while(startIndex>=0 && res.charAt(startIndex)==' '){
                startIndex--;
            }

            if(startIndex<0){
                break;
            }

            int endIndex = startIndex;
            while(startIndex>=0 && res.charAt(startIndex)!=' '){
                startIndex--;
            }if(res.length()==0){
                res.append(res.substring(startIndex+1,endIndex+1));
            }else{
                res.append(" ");
                res.append(res.substring(startIndex+1,endIndex+1));
            }
        }
        return res.toString();
    }
}
