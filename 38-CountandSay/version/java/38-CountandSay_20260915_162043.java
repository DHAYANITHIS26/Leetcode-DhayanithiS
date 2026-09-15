// Last updated: 15/09/2026, 16:20:43
1class Solution {
2    public boolean isValidSudoku(char[][] grid) {
3        Set<String> set = new HashSet<>();
4        for(int i = 0;i < 9;i++){
5            for(int j = 0;j < 9;j++){ if(grid[i][j] == '.') continue;
6            String s1 = ""+grid[i][j]+"in row"+i;
7            String s2 = ""+grid[i][j]+"in col"+j;
8            String s3 = ""+grid[i][j]+"in box"+i/3+""+j/3;
9            if(set.contains(s1)||set.contains(s2)||set.contains(s3)) return false;
10            set.add(s1);
11            set.add(s2);
12            set.add(s3);
13            }
14        }
15        return true;
16    }
17}