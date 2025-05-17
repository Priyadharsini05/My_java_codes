/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer> nums = new ArrayList<>();
    public void inorder(TreeNode root)
    {
        if(root == null)
        {
            return;
        }
        inorder(root.left);
        nums.add(root.val);
        inorder(root.right);
    }
    public TreeNode createBST(List<Integer> nums, int x, int y)
    {
        while(x<y)
        {
        int middle = (x+y)/2;
        TreeNode root = new TreeNode(nums.get(middle));
        root.left = createBST(nums, 0, middle - 1);
        root.right = createBST(nums, middle + 1, y);
        return root;
        }
    }
    public TreeNode balanceBST(TreeNode root) {
        inorder(root);
        TreeNode newNode = createBST(nums, 0, nums.size() - 1);
        return newNode;
    }
}
