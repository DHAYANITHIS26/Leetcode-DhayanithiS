# Last updated: 15/09/2026, 14:42:51
1class Solution(object):
2    def sumDistance(self, nums, s, d):
3        """
4        :type nums: List[int]
5        :type s: str
6        :type d: int
7        :rtype: int
8        """
9        
10
11        n = len(s)
12
13        new = [0] * n
14
15        for i in range(n):
16            if s[i] == 'L':
17                new[i] = nums[i] - d
18            else:
19                new[i] = nums[i] + d
20
21        new.sort()
22
23        dis = 0
24        cur = 0
25
26        for i in range(n):
27            dis += i * new[i] - cur
28            cur += new[i]
29
30        return dis % (10**9+7)