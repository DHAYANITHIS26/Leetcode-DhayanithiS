// Last updated: 11/08/2026, 16:05:12
class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder res = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;
            res.insert(0, (char) ((columnNumber % 26) + 'A'));
            columnNumber /= 26;
        }
        
        return res.toString(); 
    }
}