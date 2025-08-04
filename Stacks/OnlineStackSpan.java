//class StockSpanner {
//
//    Stack<Integer> indexStack;
//    ArrayList<Integer> elementList;
//
//    public StockSpanner() {
//        indexStack = new Stack<>();
//        elementList = new ArrayList<>();
//    }
//
//    public int next(int price) {
//        elementList.add(price);
//        while(!indexStack.isEmpty() && elementList.get(indexStack.peek())<=price){
//            indexStack.pop();
//        }
//
//        int previousGreaterIndex = (indexStack.isEmpty())?-1:indexStack.peek();
//        int currentIndex = elementList.size()-1;
//        int ans = currentIndex - previousGreaterIndex;
//        indexStack.push(currentIndex);
//        return ans;
//    }
//}
//
///**
// * Your StockSpanner object will be instantiated and called as such:
// * StockSpanner obj = new StockSpanner();
// * int param_1 = obj.next(price);
// */