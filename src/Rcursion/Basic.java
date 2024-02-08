package Rcursion;

public class Basic {
    public static void main(String[] args) {
      //  num(5);
        //System.out.print(fact(5));
       // printN1(5);

    //   reverse(1842);
       //System.out.print(res);

       System.out.print(fact(1842));
    }



    static int res=0;
    static void reverse(int n){
        if(n==0){
            return;
        }
       int rem=n%10;

       res=res*10+rem;
       reverse(n/10);

    }
    static int digits(int n){
        if(n/10<=0){
            return n;
        }

        return n%10 *digits(n/10);
    }

    static int sum(int n){
        if(n==1){
            return 1;
        }

        return n+sum(n-1);

    }

    static int fact1(int n){
        if(n==1){
            return 1;
        }

        return n*fact1(n-1);

    }

    static void num(int n){
        if(n==0){
            return;
        }

        num(n-1);
        System.out.print(n);
    }

    static int  fact(int n){
        if(n<2){
            return 1;
        }

        return fact(n-1)+fact(n-2);

    }

    static void printN(int n){
        if(n<1){
            return ;
        }

        System.out.print(n);
         printN(n-1);

    }
    static void printN1(int n){
        if(n<1){
            return ;
        }


        printN1(n-1);
        System.out.println(n);

    }
}
