import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        boolean check = anagramChecker("abcd","dabc");
        System.out.println(check);
    }

    //TC :-O(n^2) (Worst Case)
    public static boolean anagramChecker(String a,String b){
        if(a.length()!=b.length()){
            return false;
        }
        char arrA[] = a.toCharArray();
        char arrB[] = b.toCharArray();

        Arrays.sort(arrA);Arrays.sort(arrB);
        int aIndex = 0 , bIndex = 0;
        int len = a.length();
        while(aIndex<len && bIndex<len){
            if(arrA[aIndex]!=arrB[bIndex]){
                return false;
            }
            aIndex++;bIndex++;
        }
        return true;
    }

    //TC:- O(n) Worst Case
    public static boolean optimalBooleanChecker(String a, String b){
        if(a.length()!=b.length()){
            return false;
        }
        int len = a.length();
        int freq[]  = new int[26];
        int indexA = 0 , indexB  = 0;
        while(indexA<len && indexB<len){
            char chA = a.charAt(indexA);
            int freqIndex = chA - 97;
            freq[freqIndex]+=1;

            char chB = b.charAt(indexB);
            int freqIndexB = chB - 97;
            freq[freqIndexB]-=1;

            indexA++;indexB++;
        }

        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                return false;
            }
        }
        return true;
    }
}
