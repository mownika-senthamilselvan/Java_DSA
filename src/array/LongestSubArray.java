package array;

public class LongestSubArray {
    public static void main(String[] args){
        int arr[]={1,2,3,1,1,1,4,2,3};
        int num=3;
        SubArrayOp(arr,num);
    }
// Bruteforce Solution
     static void SubArray(int[] arr,int num){
        int len=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum=sum+arr[j];
                    //System.out.println(sum);

                if(sum==num){
                    len=Math.max(len,j-i+1);
                }

            }

        }
        System.out.print(len);
     }

     //optimal solution
    static void SubArrayOp(int[] arr,int num){
        int i=0,j=0,sum=arr[0];
        int maxLen=Integer.MIN_VALUE;
        while(j<arr.length){
            while(i<=j&& sum>num){
                sum=sum-arr[i];
                i++;
            }

            if(sum==num){
                maxLen=Math.max(maxLen,j-i+1);
            }

            j++;
            if(j<arr.length){
                sum=sum+arr[j];
            }
        }
      System.out.print(maxLen);
    }

}
