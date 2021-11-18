package 二叉树;

import java.util.Stack;

/*
https://leetcode-cn.com/problems/binary-tree-tilt/
1.通过层序遍历将他们存入栈中
2. 在取出栈中的值出来比较
 */
public class _563_二叉树的坡度 {
    int ans=0;
    public int findTilt(TreeNode root) {
        dfs(root);
        return ans;
    }
//    深度优先遍历
    public int dfs(TreeNode node){
        if (node==null){
            return 0;
        }
        int sumLeft=dfs(node.left);
        int sumRight=dfs(node.right);
        ans+=Math.abs(sumLeft-sumRight);
        return sumLeft+sumRight+ node.val;

    }
}
