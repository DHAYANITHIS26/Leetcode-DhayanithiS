// Last updated: 11/08/2026, 15:58:29
class Solution {
    public boolean checkIfPangram(String sentence) {
       int a[]=new int[26];
       for(char c:sentence.toCharArray()){
        int idx=c-'a';
        a[idx]++;
       }
       for(int i=0;i<26;i++)
       { if(a[i]==0)
        return false;}
       return true;
    }
}