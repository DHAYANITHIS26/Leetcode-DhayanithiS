// Last updated: 28/08/2026, 14:23:47
1class Solution {
2    public int findContentChildren(int[] g, int[] s) {
3        Arrays.sort(g);
4        Arrays.sort(s);
5        int c = 0;
6        int c1 = 0;
7        while(c1 < s.length && c < g.length){
8            if(s[c1] >= g[c]){
9                c++;
10            }
11            c1++;
12        }        
13        return c;
14    }
15}