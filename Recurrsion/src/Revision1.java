public class Revision1 {

    // Q.10 Reverse a Number
    // Way 1
    static int sum = 0;
    static void reverse(int n){
        if(n==0){
            return;
        }
        int rem = n%10;
        sum = sum*10+rem;
        reverse(n/10);
    }

    // Way 2
    static int rev2(int n){
        int digits = (int)(Math.log10(n))+1;
        return helper(n,digits);
    }

    static int helper(int n,int digits){
        if(n%10==n){
            return n;
        }
        int rem = n%10;
        return rem*(int)(Math.pow(10,digits-1))+helper(n/10,digits-1);
    }

    public static void main(String[] args) {
//       int ans =  fibo(10);
////        System.out.println(ans);
//        int[] newArr = {12,13,14,15,16,17,18};
//        int pos = search(newArr,17,0, newArr.length);
      //  ntoone(5);
//        oneton(5);
//        System.out.println(pos);

//        int ans = fibo(10);
//        System.out.println(ans);

//        int ans = sumD(1342);
//          int ans = prod(123);
//        System.out.println(ans);

//        concept(5);
//        reverse(1234);
//        System.out.println(sum);
        System.out.println(palin(1231));
    }
//  Q.1 1 to n
    static void num(int n){
        if(n==5){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        num(n+1);
    }
// Q.2 Fibonnaci
    static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
// Q.3 Binary Search using Recursion
    static int search(int[] arr,int target, int s,int e){
        if(s>e){
            return -1;
        }
        int m = s+(e-s)/2;
        if(target==arr[m]){
            return m;
        }
        if(target<arr[m]){
            return search(arr,target,s,m-1);
        }
        return search(arr,target,m+1,e);
    }
// Q.4 n to one
    static void ntoone(int n){
        if(n==0){
            System.out.println(n);
            return;
        }
        System.out.println(n+" ");
        ntoone(n-1);
    }

 // Q.5 1 to n
    static void oneton(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        oneton(n-1);
        System.out.print(n+" ");
    }

 // Q.6 Factorial of a number
    static int fact(int n){
        if(n<=1){
            return 1;
        }
        return n*(n-1);
    }

 // Q.7 Sum of Digits
    static int sumD(int n){
        if(n==0){
            return 0;
        }return (n%10) + sumD(n/10);
    }

 // Q.8 Prod of Digits
    static int prod(int n){
        if(n%10==n){
            return n;
        }
        return (n%10) * prod(n/10);
    }

 // Q.9 Descending Order
    static void concept(int n){
        if(n==0){
            System.out.println(n + " ");
            return;
        }
        System.out.print(n +" ");
        concept(n-1);
    }

  // Q.10 Palindrome Number
    static boolean palin(int n){
        return n == rev2(n);
    }


}
