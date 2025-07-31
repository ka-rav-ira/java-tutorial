package Stacks;

public class Stacks {

    int stack[];
    int top;
    int size;

    public Stacks(int stackSize) {
        stack = new int[stackSize];
        top = -1;
        size = stackSize;
    }

    //Insert Operation
    public void push(int element){
        if(top>=size-1){
            System.out.println("Stack is full - Overflow");
            return;
        }else{
            top++;
            stack[top]= element;
        }
    }

    //IsEmpty Operation
    public boolean isEmpty(){
        return top<=-1;
    }

    //Get Size Operation
    public int size(){
        return top+1;
    }

    //peek element
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        return stack[top];
    }

    public int pop(){
        int val = peek();
        if(val!=Integer.MIN_VALUE){
            top--;
        }
        return val;
    }

    //Print the STack
    public void printStack(){
        System.out.println("Printing Stack");
       for(int i=0;i<=top;i++){
           System.out.print(stack[i]+" ");
       }
       System.out.println();
    }

    public static void main(String[] args){
        int n = 5;
        Stacks s = new Stacks(n);
        System.out.println("isEmpty:" + s.isEmpty());
        s.push(9);
        s.printStack();
        s.push(1);
        s.printStack();
        s.push(8);
        s.printStack();
        s.push(5);
        s.printStack();
        s.push(8);
        s.printStack();
        s.push(2);
        s.printStack();
        s.push(6);
        s.printStack();
        s.pop();
        s.printStack();
        System.out.println("Size"+s.size());
        s.pop();
        s.printStack();
        s.pop();
        s.printStack();
        s.pop();
        s.printStack();
        System.out.println("peek:"+  s.peek());
    }

}


