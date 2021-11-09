package AVL树;
/*
 * 1
 * https://leetcode-cn.com/problems/balanced-binary-tree/
 */
public class _110_平衡二叉树 {
	public boolean isBalanced(TreeNode root) {
//		如果不是-1就返回true
        return height(root) != -1;
    }

    private int height(TreeNode node) {
        if (node == null) return 0;
//        通过递归，然后由底向上判断，先获取最后一个左子树的左右子树节点
        int leftHeight = height(node.left), rightHeight= height(node.right);
//        因为如果存在一棵子树不平衡，则整个二叉树一定不平衡，我们通过左右子树相减，符合平衡条件是0,-1,1,如果高度差的绝对值大于1，说明不符合平衡，直接返回false
        if (leftHeight == -1 || rightHeight  == -1 || Math.abs(leftHeight - rightHeight) > 1)
            return -1;
//        选择该节点左右子树中高度最高的加1返回,然后接着向上一个节点判断
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
