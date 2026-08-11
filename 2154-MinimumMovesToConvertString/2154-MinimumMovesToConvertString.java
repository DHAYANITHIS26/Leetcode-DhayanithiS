// Last updated: 11/08/2026, 15:58:20
class Solution {
    public int minimumMoves(String s) {
        int i=0;
        int step=0;
        while(i<s.length()){
            if(s.charAt(i)=='X'){
                i=i+3;
                step++;
            }
            else{
                i++;
            }
        }
        return step;
    }
}