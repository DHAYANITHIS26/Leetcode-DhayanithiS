// Last updated: 31/08/2026, 10:32:48
1class Solution {
2    public int hammingDistance(int x, int y) {
3        int count = 0;
4        if(x == y){
5            return count;
6        }
7        while(x > 0 || y > 0){
8            int xBit = 0;
9            int yBit = 0;
10            if(x > 0){
11                xBit = x %2;
12                x = Math.floorDiv(x,2);
13            }
14            if(y > 0){
15                yBit = y % 2;
16                y = Math.floorDiv(y,2);
17            }
18            if(xBit != yBit){
19                count++;
20            }
21        }
22        return count;
23    }
24}