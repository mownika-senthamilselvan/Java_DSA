package array;

public class reverse {
    public static void main(String[] args) {
        char[] ch={'h','e','l','l','o'};
        reverseString(ch);
    }

        public static void reverseString(char[] s) {
            int len = s.length;
            char[] arr = new char[len];
            int k = 0;

            // Copy characters to the new array in reverse order
            for (int i = len - 1; i >= 0; i--) {
                arr[k] = s[i];
                k++;
            }

            // Print the reversed string
            for (int i = 0; i < len; i++) {
                System.out.print(arr[i]);
            }
        }
    }


