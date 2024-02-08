package array;

public class PrimeNumber {
    public static void main(String[] args) {

        int a = 12;
        boolean res=primeNumSq1(a);
        System.out.println(res);
    }
    //optical solution
    static boolean primeNumSq1(int n){
        if(n==1){
            return false;
        }

        if(n==2 || n==3){
            return true;
        }

        if(n%2==0 || n%3==0){
            return false;
        }

        for(int i=5;i*i<=n;i+=6){
            if(n%i==0 || n%(i+2)==0){
                return false;
            }
        }
     return true;
    }
    // Using square root
    static void primeNumSq(int a){
        int flag=0;
        for(int i=2;i<=Math.sqrt(a);i++){
            if(a%i==0){
                flag=1;
                System.out.println("Not a prime number");
                break;
            }
        }
        if(flag==0){
            System.out.println("Its is a prime number");
        }
    }
    static void primeNum(int a){
        int flag=0;
        for(int i=2;i<=a/2;i++){
            if(a%i==0){
                flag=1;
                System.out.println("Not a prime number");
                break;
            }
        }
        if(flag==0){
            System.out.println("Its is a prime number");
        }
    }
}
