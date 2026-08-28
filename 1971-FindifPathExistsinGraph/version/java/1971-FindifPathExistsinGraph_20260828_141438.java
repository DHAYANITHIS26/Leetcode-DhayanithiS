// Last updated: 28/08/2026, 14:14:38
1class Solution {
2    boolean found = false;
3    public boolean validPath(int n, int[][] edges, int start, int end) {
4        if(start == end) return true;
5        Map<Integer,List<Integer>> graph = new HashMap();
6        boolean[] visited = new boolean[n];
7        for(int i = 0;i < n;i++)graph.put(i,new ArrayList());
8        for(int[] edge : edges){
9            graph.get(edge[0]).add(edge[1]);
10            graph.get(edge[1]).add(edge[0]);
11        }
12        dfs(graph,visited,start,end);
13        return found;
14    }
15    private void dfs(Map < Integer,List<Integer>> graph,boolean[] visited,int start,int end){
16        if(visited[start] || found) return;
17        visited[start] = true;
18        for(int n : graph.get(start)){
19            if(n == end){
20                found = true;
21                break;
22            }
23            if(!visited[n])
24                dfs(graph,visited,n,end);
25        }
26    }
27}