// Last updated: 28/08/2026, 13:49:45
1class Solution {
2    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
3        int originalColor = image[sr][sc];
4        if(originalColor == color) return image;
5        dfs(image,sr,sc,originalColor,color);
6        return image;
7    }
8    void dfs(int[][] image,int sr,int sc,int originalColor,int givenColor){
9        int m = image.length;
10        int n = image[0].length;
11        if(sr < 0 || sr >= m|| sc < 0||sc >= n) return;
12        if(image[sr][sc] != originalColor)return;
13        image[sr][sc] = givenColor;
14        dfs(image,sr+1,sc,originalColor,givenColor);
15        dfs(image,sr - 1,sc,originalColor,givenColor);
16        dfs(image,sr,sc + 1,originalColor,givenColor);
17        dfs(image,sr,sc - 1,originalColor,givenColor);
18    }
19}