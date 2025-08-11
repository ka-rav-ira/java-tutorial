package Stacks;

public class NextGreaterElement {
    /*
    class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();

        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()<=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                res.add(-1);
            }else{
                res.add(stack.peek());
            }
            stack.push(arr[i]);

        }
        Collections.reverse(res);
        return res;
    }
}
     */
}
