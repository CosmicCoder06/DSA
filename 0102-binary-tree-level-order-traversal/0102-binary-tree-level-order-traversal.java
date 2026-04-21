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
    public List<List<Integer>> levelOrder(TreeNode root) {
     Queue<TreeNode> q = newLinkedList<>();
     q.offer(root);
     while(!qisEmpty()){
        TreeNode cur = q.peek();
        List<Integer> curr = new ArrayList<>();
        int lvlSize = q.size();
        while(lvlSize > 0){
            curr.add(q.peek().val);
            if(q.peek().left != null)q.offer(q.peek().left);
            if(q.peek().right != null)q.offer(q.peek().right);
            lvlSize--;
            q.peek();
        }
        res.add(curr);
     } 
    }
}