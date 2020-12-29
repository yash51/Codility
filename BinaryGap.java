// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        String binaryString = Integer.toBinaryString(N);
        binaryString = binaryString.substring(0, binaryString.lastIndexOf("1"));
        String blocks[] = binaryString.split("1");
        Arrays.sort(blocks, (a,b) -> b.length() - a.length());

        return blocks.length == 0 ? 0 : blocks[0].length();
        
    }
}
