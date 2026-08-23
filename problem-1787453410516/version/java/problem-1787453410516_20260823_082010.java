// Last updated: 23/08/2026, 08:20:10
1class Solution {
2    public int longestSubarray(int[] nums, int k) {
3        int m = 0;
4        for(int num : nums){
5            m = Math.max(m,num);
6        }
7        int[] spf = new int[m+1];
8        for(int i = 2;i <= m;i++){
9            if(spf[i] == 0){
10                for(int j = i;j <= m;j += i){
11                    if(spf[j] == 0){
12                        spf[j] = i;
13                    }
14                }
15            }
16        }
17        List<Integer>[] factors = new ArrayList[nums.length];
18        for(int i = 0;i < nums.length;i++){
19            factors[i] = new ArrayList<>();
20            int x = nums[i];
21            while(x>1){
22                int p = spf[x];
23                factors[i].add(p);
24                while(x%p == 0){
25                    x /= p;
26                }
27            }
28        }
29        Map<Integer, Integer>count = new HashMap<>();
30        int distinct = 0;
31        int left = 0;
32        int answer = 0;
33        for(int right = 0;right < nums.length;right++){
34            for(int p:factors[right]){
35                if(!count.containsKey(p)){
36                    count.put(p,1);
37                    distinct++;
38                }else{
39                    count.put(p,count.get(p)+1);
40                }
41            }
42            while(distinct>k){
43                for(int p:factors[left]){
44                    int c = count.get(p);
45                    if(c == 1){
46                        count.remove(p);
47                        distinct--;
48                    }else{
49                        count.put(p,c-1);
50                    }
51                }
52                left++;
53            }
54            answer = Math.max(answer,right-left+1);
55        }
56        return answer;
57    }
58}