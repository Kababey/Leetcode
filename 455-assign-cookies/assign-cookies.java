import java.util.Arrays;
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int sizeP = g.length;
        int sizeT = s.length;
        Arrays.sort(g);
        Arrays.sort(s);

        
        int counter = 0; 
        int i = 0, j = 0;
        while (i < sizeP && j < sizeT) {
            if (g[i] <= s[j]) {
            counter++;
            i++;
            j++;
            } else {
            j++;
            }
        }
        return counter;
        }
    }
