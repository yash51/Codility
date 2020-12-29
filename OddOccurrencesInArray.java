// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        if(A == null){
            return -1;
        }
        if(A.length%2 == 0){
            return -1;
        }

        HashSet<Integer> hset = new HashSet<>();

        for(int x: A){
            if(hset.contains(x))
                hset.remove(x);
            else 
                hset.add(x);
        }
       
       for(int x:hset){
           return x;
       }

       return -1;
    }
}
