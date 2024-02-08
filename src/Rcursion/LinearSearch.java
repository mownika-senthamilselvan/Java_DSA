package Rcursion;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={1,2,5,213,5};
      //  System.out.println(search(arr,23,0));
        //System.out.println(search2(arr,23,arr.length-1));
//        duplicates(arr,5,0);
//        System.out.println(list);
        //dupList(arr,5,0);
        //System.out.print(list);
//        ArrayList<Integer> ans=dupList1(arr,5,0,new ArrayList<>());
//        System.out.println(ans);
        ArrayList<Integer> ans1=dupList2(arr,5,0);
        dupList2(arr,5,0);
        System.out.print(ans1);

    }

        static ArrayList<Integer> dupList2(int[] arr, int target, int index){
            ArrayList<Integer> list1=new ArrayList<>();
        if(index==arr.length-1){
            return list;
        }

        if(target==arr[index]){
            list1.add(index);
        }
        ArrayList<Integer> ansFormBelowCalls= dupList2(arr,target,index+1);

        list1.addAll(ansFormBelowCalls);

        return list1;

    }


    // How to return ArrayList
    static ArrayList<Integer> dupList1(int[] arr, int target, int index,ArrayList<Integer> list1){
        if(index==arr.length-1){
            return list1;
        }

        if(target==arr[index]){
            list1.add(index);
        }
        return dupList1(arr,target,index+1,list1);

    }

    //Find the target duplicates
    static ArrayList<Integer> list=new ArrayList<>();
    static void duplicates(int[] arr, int target, int index){
        if(index==arr.length-1){
            return;
        }
        if(target==arr[index]){
           list.add(index);
        }
             duplicates(arr,target,index+1);
    }
    //From the lastElement
    static int search2(int[] arr,int target,int index){
        if(index==-1){
            return -1;
        }
        if(target==arr[index]){
            return index;
        }else{
            return search2(arr,target,index-1);
        }

    }


    static boolean search(int[] arr,int target,int index){
        if(index==arr.length){
            return false;
        }
        return target==arr[index] || search(arr,target,index+1);
    }
// Find the index value of the target
    static int search1(int[] arr,int target,int index){
        if(index==arr.length){
            return -1;
        }
        if(target==arr[index]){
            return index;
        }else{
            return search1(arr,target,index+1);
        }

    }
}
