// Last updated: 15/09/2026, 15:14:21
1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3        int n = nums.length;
4        HashMap<Integer, Integer> map = new HashMap<>();
5        for (int num : nums) {
6            map.put(num, map.getOrDefault(num, 0) + 1);
7        }
8        List<Integer>[] bucket = new ArrayList[n + 1];
9        for (int key : map.keySet()) {
10            int freq = map.get(key);
11            if (bucket[freq] == null) {
12                bucket[freq] = new ArrayList<>();
13            }
14            bucket[freq].add(key);
15        }
16        int[] ans = new int[k];
17        int index = 0;
18        for (int i = bucket.length - 1; i >= 0 && index < k; i--) {
19            if (bucket[i] != null) {
20                for (int num : bucket[i]) {
21                    ans[index++] = num;
22                    if (index == k)
23                        break;
24                }
25            }
26        }
27
28        return ans;
29    }
30}