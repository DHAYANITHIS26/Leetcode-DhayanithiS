// Last updated: 12/08/2026, 14:14:20
1class Solution {
2    public List<String> binaryTreePaths(TreeNode root) {
3        List<String> result = new ArrayList<>();
4        dfs(root, "", result);
5        return result;
6    }
7
8    private void dfs(TreeNode node, String path, List<String> result) {
9        if (node == null) return;
10        path += node.val;
11        if (node.left == null && node.right == null) {
12            result.add(path);
13        } else {
14            path += "->";
15            dfs(node.left, path, result);
16            dfs(node.right, path, result);
17        }
18    }
19}