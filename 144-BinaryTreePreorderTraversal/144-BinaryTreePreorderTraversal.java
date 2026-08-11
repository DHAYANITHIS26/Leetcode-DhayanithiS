// Last updated: 11/08/2026, 16:05:27
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preorder(root, res);
        return res;        
    }
    private void preorder(TreeNode node, List<Integer> res) {
        if (node == null) {
            return;
        }
        res.add(node.val);
        preorder(node.left, res);
        preorder(node.right, res);
        
    }    
}