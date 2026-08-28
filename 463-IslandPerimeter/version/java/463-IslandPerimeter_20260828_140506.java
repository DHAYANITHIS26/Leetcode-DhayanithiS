// Last updated: 28/08/2026, 14:05:06
1class Solution {
2    public int islandPerimeter(int[][] grid) {
3        int r = grid.length;
4        int c = grid[0].length;
5        int p = 0;
6        for(int i = 0;i < r;i++){
7            for(int j = 0;j < c;j++){
8                if(grid[i][j] == 1){
9                    if(i == 0 || grid[i-1][j]== 0){
10                        p++;
11                    }
12                    if(i == r-1|| grid[i+1][j] == 0){
13                        p++;
14                    }
15                    if(j == 0||grid[i][j-1] == 0){
16                        p++;
17                    }if(j == c-1||grid[i][j+1] == 0){
18                        p++;
19                    }
20                }
21            }
22        }
23        return p;
24    }
25}