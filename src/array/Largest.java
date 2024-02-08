package array;

public class Largest {
    public static void main(String[] args){
        int[] arr={3,2,1,5,4};
        int[] arr1={1,2,2,3,3,4};
        duplicates(arr1);
//        large(arr);
//        largeOp(arr);
//        secondLar(arr);
//        secondSmall(arr);
//        sort(arr);
    }

    // Remove the duplicates in-place sorted array

    //Using Sets
    static void duplicateSet(int[] arr1){
        
    }

    //Iteration
    static void duplicates(int[] arr1){
        int i=0,j=1;
        while(i< arr1.length && j< arr1.length){
            if(arr1[i]==arr1[j]){
                j++;
            } else if (arr1[i]<arr1[j]) {
                arr1[i+1]=arr1[j];
                i++;
            }
        }
        System.out.print(i);
        for(int k=0;k<i;k++){
            System.out.println(arr1[k]);
        }
    }

    //arr is sorted or not
    static void sort(int[] arr){
        int l=arr[0];
        for(int i= arr.length-1;i>0;i--){
            if(arr[i]>=arr[0]){

            }else{
                System.out.println("Unsorted");
                break;
            }
        }

    }

    // Second smallest element
    static void secondSmall(int[] arr){
        int small=arr[0];
        int second=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<small){
                second=small;
                small=arr[i];
            } else if (arr[i]>small && arr[i]<second ) {
                second=arr[i];
            }
        }
        System.out.println(second);
    }
 // Second Largest element
    static void secondLar(int[] arr){
        int large=arr[0];
        int second=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>large){
                second=large;
                large=arr[i];
            } else if (arr[i]<large && arr[i]>second) {
                second=arr[i];
            }
        }
        System.out.println(second);
    }

    // Bruteforce using sorting
    static void large(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++)
           if(arr[i]>arr[j]){
               int temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
           }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        // Largest Number
        System.out.println(arr[arr.length-1]);
    }

    //optimise solution
    static void largeOp(int[] arr){
        int largest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println(largest);
    }
}
