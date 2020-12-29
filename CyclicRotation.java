// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int[] A, int K) {
        if(A == null)
            return A;
        if(A.length < 2 || K == 0)
            return A;
        
        K = K % A.length;
        
      
        reverse(A, 0, A.length - 1);
        reverse(A, 0, K-1);
        reverse(A, K, A.length - 1);
// [3, 8, 9, 7, 6]
// 6, 7, 9, 8, 3
// 9, 7, 6, 8, 3
// 9, 7, 6, 3, 8
        return A;

    }

    public static void reverse(int arr[], int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }


    }
}
