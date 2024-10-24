package 二叉树;

/**
 * @Author chenyunzhi
 * @DATE 2024/10/24 10:45
 * @Description:https://leetcode.cn/problems/convert-sorted-array-to-binary-search-tree/description/
 */

public class _108_将有序数组转换为二叉搜索树 {
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
    public TreeNode sortedArrayToBST(int[] nums) {
        return builder(nums,0,nums.length-1);
    }

    public TreeNode builder(int[] nums, int left, int right) {
        // 如果到达临界值就返回null
        if (left > right) {
            return null;
        }
        // 取中间节点
        int min = (left + right+1)/2;
        TreeNode treeNode = new TreeNode(nums[min]);
        // 给中间节点赋值左右子节点
        treeNode.left = builder(nums,left,min-1);
        treeNode.right = builder(nums,min+1,right);
        return treeNode;
    }

}
