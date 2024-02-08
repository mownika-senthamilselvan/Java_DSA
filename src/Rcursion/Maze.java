package Rcursion;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args){
        System.out.print(count(3,3));
        path(3,3,"");
    }


    //Cover the Entire Path
    static void path(int r,int c, String p){
        if(r==1 && c==1){
            System.out.print(p);
            return ;
        }
        if(r>1){
            path(r-1,c,p+'D');
        }if(c>1){
            path(r,c,p+'R');
        }
    }

    static int count(int r,int c){
        if(r==1 || c==1){
            return 1;
        }

        int left= count(r-1,c);
         int right=count(c-1,r);

         return left+right;
    }

}
