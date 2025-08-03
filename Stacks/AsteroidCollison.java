package Stacks;
import java.util.*;
public class AsteroidCollison {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int a:asteroids){
            boolean alive = true;
            if(a>0){
                stack.push(a);
            }else{

                while(alive&& !stack.isEmpty() && stack.peek()>0){
                    int top = stack.peek();
                    if(top<Math.abs(a)){
                        stack.pop();
                        continue;
                    }else if(top==Math.abs(a)){
                        stack.pop();
                        alive = false;
                        break;
                    }else{
                        alive = false;
                        break;
                    }
                }

                if(alive){
                    stack.push(a);
                }
            }
        }

        int n = stack.size();
        int[] result = new int[n];
        for(int i=n-1;i>=0;i--){
            result[i] = stack.pop();
        }

        return result;
    }
}
