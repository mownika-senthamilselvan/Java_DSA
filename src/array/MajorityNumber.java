package array;
import java.util.Arrays;
public class MajorityNumber {
    static void majorityNumber(int[] arr){
        Arrays.sort(arr);
        int i=0,j=0,count=0,max=Integer.MIN_VALUE, majorityNumber =0;

        while(j<arr.length){
            if(arr[i]==arr[j]){
                j++;
                count++;
            }else{
                if(count>max){
                    max=count;
                    majorityNumber =arr[i];
                }
                i=j;
                count=0;
            }

        }
        if (count>max ) {
            max=count;
            majorityNumber = arr[i];
        }

        System.out.print(max);
    }

    public static void main(String[] args) {
        int arr[] ={3,3,4,2,4,2,2,2,3,2};
        majorityNumber(arr);
    }
}

