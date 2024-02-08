package array;

import java.util.ArrayList;

public class ZeroEnd {
    public static void main(String[] args){
        int[] arr={1,2,0,3,4,5,6,0,0,0,8};
        moveZeros(arr);
    }
    //Brute force Solution
    static void moveZeros(int[] arr){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                list.add(arr[i]);
            }
        }

        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }

        for(int i=list.size();i< arr.length;i++){
            arr[i]=0;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }

    }
}
