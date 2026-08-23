// Last updated: 23/08/2026, 08:26:18
1class Solution {
2    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
3        Set<Integer> set = new HashSet<>();
4        for(int num : nums){
5            set.add(num);
6        }
7        List<List<Integer>> ans = new ArrayList<>();
8        int s = -1;
9        for(int i = lower;i <= upper;i++){
10            if(!set.contains(i)){
11                if(s == -1){
12                    s = i;
13                }
14            }else{
15                if(s != -1){
16                    ans.add(Arrays.asList(s,i-1));
17                    s = -1;
18                }
19            }
20        }
21        if(s != -1){
22            ans.add(Arrays.asList(s,upper));
23        }
24        return ans;
25    }
26}