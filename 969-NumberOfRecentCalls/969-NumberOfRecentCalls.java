// Last updated: 11/08/2026, 16:00:11
class RecentCounter {
    private static final int[] records = new int[10000]; //
    private int start;
    private int end;

    public RecentCounter() {        
        start = 0;
        end = 0;
    }
    
    public int ping(int t) {
        while (start < end && (t - records[start] > 3000)) { 
            start++; 
        }
        records[end++] = t;
        return end - start;
    }
}