package Rcursion;

import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args){
       ArrayList<String> res=padList("","12");
        System.out.println(res);
        System.out.println(padCount("","ab"));
    }

    public static int padCount(String p, String up){
        if(up.isEmpty()){
           return 1;
        }

       int count=0;
        int digit=(up.charAt(0)-'0');
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i);
            count=count+(padCount(p+ch,up.substring(1)));
        }
        return count;
    }

    public static ArrayList padList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans=new ArrayList<>();
        int digit=(up.charAt(0)-'0');
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i);
            ans.addAll(padList(p+ch,up.substring(1)));
        }
          return ans;
    }

    public static void pad(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
         int digit=(up.charAt(0)-'0');
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i);
            pad(p+ch,up.substring(1));
        }

    }
}
