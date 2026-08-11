// Last updated: 11/08/2026, 15:57:51
class Solution {
    public int secondsBetweenTimes(String st, String et) {
        int ss = tts(st);
        int es = tts(et);
        return (es - ss) ;
    }
    private int tts(String t){
        String[] p = t.split(":");
        int h = Integer.parseInt(p[0]);
        int m = Integer.parseInt(p[1]);
        int s = Integer.parseInt(p[2]);
        return h * 3600 + m * 60 + s;
    }
}