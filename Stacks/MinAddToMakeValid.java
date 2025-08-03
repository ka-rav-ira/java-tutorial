package Stacks;

public class MinAddToMakeValid {
    public int minAddToMakeValid(String s) {
        int unmatchedOpen = 0;
        int matchedPairs = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                unmatchedOpen++;
            } else if (c == ')') {
                if (unmatchedOpen > 0) {
                    unmatchedOpen--;
                    matchedPairs++;
                }

            }
        }
        return s.length() - 2 * matchedPairs;
    }
}

