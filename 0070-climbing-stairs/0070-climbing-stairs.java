import java.util.*;
class Solution {

    
    static int climbStairs(int n) {
        if(n<=2){
        return n;
        }
        int a=3,b=2;

            for(int i=0;i<n-3;i++){
                a=a+b;
                b=a-b;
            }
            return a;
        }
        public static void main(String[]args){
            Scanner sc= new Scanner(System.in);
            int n=sc.nextInt();
            System.out.println(climbStairs(n));
        }
    }
