// Last updated: 12/09/2026, 09:30:06
1class Solution {
2    public List<List<Integer>> findWinners(int[][] matches) {
3        Map<Integer, Integer> Winnermap = new HashMap<>();
4        Map<Integer, Integer> Lossermap = new HashMap<>();
5        for (int[] match : matches) {
6            int winner = match[0];
7            int looser = match[1];
8            Winnermap.put(winner, Winnermap.getOrDefault(winner, 0) + 1);
9            Lossermap.put(looser, Lossermap.getOrDefault(looser, 0) + 1);
10        }
11        List<Integer> Winnerlist = new ArrayList<>();
12        List<Integer> Looserlist = new ArrayList<>();
13        for (int player : Winnermap.keySet()) {
14            if (!Lossermap.containsKey(player)) {
15                Winnerlist.add(player);
16            }
17        }
18        for (Map.Entry<Integer, Integer> loose : Lossermap.entrySet()) {
19            if (loose.getValue() == 1) {
20                Looserlist.add(loose.getKey());
21            }
22        }
23        Collections.sort(Winnerlist);
24        Collections.sort(Looserlist); 
25        List<List<Integer>> answer = new ArrayList<>();
26        answer.add(Winnerlist);
27        answer.add(Looserlist);
28
29        return answer;
30
31    }
32
33}