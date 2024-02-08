package Rcursion;

public class Palindrome {
    public static void main(String[] args) {
       // System.out.print(palindrome(5005));
//        count(5005);
//        System.out.println(c);
        System.out.print(count1(5005));
    }

    static int  count1(int n){
       return helper(n,0);
    }

    private static int helper(int n,int c){
        if(n==0){
            return c;
        }

        int rem=n%10;
        if(rem==0){
            return helper(n/10,c+1);
        }
         return helper(n/10,c);
    }
    static int c=0;
    static void  count(int n){
        if(n==0){
            return ;
        }
        if(n%10==0){
            c++;
        }
         count(n/10);
    }

    static int res=0;
    static int reverse(int n){
        if(n==0){
            return res;
        }
        int rem=n%10;

        res=res*10+rem;
        return reverse(n/10);

    }

    static boolean palindrome(int n){
        return n == reverse(n);
    }





}
