package Rcursion;

public class ArrRecursion {
    public static void main(String[] args) {
        int[] arr={1,2,1,8,9};
        sorted1(arr,0);
        System.out.println( sorted1(arr,0));
    }

    //Using recursion
    static boolean sorted1(int[] arr,int index){
        if(index==arr.length-1){
            return true;
        }

        return arr[index]<arr[index+1] && sorted1(arr,index+1);
    }
// Without using recursion
    static void sorted(int[] arr){
        int flag=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    continue;
                }else{
                    flag=1;
                    break;
                }
            }
        }
        if(flag==0){
            System.out.println("Sorted");
        }else{
            System.out.println("Unsorted");
        }
    }
}
