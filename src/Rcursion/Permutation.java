package Rcursion;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args){
        String str="abc";
        //permutations("",str);
//        ArrayList<String> res=permutationsList("",str);
//        System.out.println(res);
        System.out.println(permutationsCount("","ab"));
    }

    public static int permutationsCount(String p,String up){
        if(up.isEmpty()){
            return 1;
        }
        int count=0;
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++) {
            String s =p.substring(0,i);
            String l=p.substring(i,p.length());
            count =count+permutationsCount(s+ch+l,up.substring(1));
        }
        return count;
    }

    public static ArrayList permutationsList(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
             return list;
        }

        ArrayList<String> ans=new ArrayList<>();

        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());

            ans.addAll(permutationsList(f+ch+s,up.substring(1)));
        }

        return ans;
    }

    public static void permutations(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());

            permutations(f+ch+s,up.substring(1));
        }

    }

}
