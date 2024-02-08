package array;
import java.util.*;

public class HrIssue {
        static int func(int s,int p,int n)
        {
            if(p==n-1) return 1;
            int ans=0;
            for(int i=s;i<=9;i++)
                ans += func(i,p+1,n);
            return ans;
        }
        public static void main (String[]args)
        {
            Scanner sc = new Scanner (System.in);
            int n = sc.nextInt ();
            int  ans=0;
            for(int i=0; i<n; i++){
                int a = sc.nextInt ();
                for(int j=0; j <=9; j++)
                    ans+=func(j,0,a);
            }
            System.out.println (ans);
        }
}

