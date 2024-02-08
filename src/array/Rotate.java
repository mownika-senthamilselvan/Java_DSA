package array;

public class Rotate {
    public static void main(String[] args){
        int[] arr1={1,2,3,4,5};
        int rot=2;
        rotate1(arr1,rot);
    }
// array left rotation
    static void rotate(int[] arr,int rotate){
        while(rotate>0){
            int temp=arr[0];
            for(int i=0;i<arr.length-1;i++){
                arr[i]=arr[i+1];
            }
            arr[arr.length-1]=temp;
            rotate--;
        }

      for(int i=0;i<arr.length;i++){
          System.out.print(arr[i]);
      }

    }
    //Better Solution
    static void rotate1(int[] arr,int k){
        int n= arr.length;
        if(n==0)
            return;
        k=k%n;
        if(k>n)
            return;

        int[] temp=new int[k];
        for(int i=0;i<k;i++){
            temp[i]=arr[i];
        }

        for(int i=0;i<n-k;i++){
            arr[i]=arr[i+k];
        }

        for(int i=n-k;i<n;i++){
            arr[i]=temp[i-n+k];
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }

    }
    // Optimal solution
    static void rotate2(int[] arr,int r){
        reverse(arr,0,r-1);
        reverse(arr,r,arr.length-1);
        reverse(arr,0, arr.length-1);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }

    }
    static void reverse(int[] arr,int start,int end){
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

}
