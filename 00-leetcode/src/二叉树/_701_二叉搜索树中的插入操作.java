package 二叉树;

public class _701_二叉搜索树中的插入操作 {
//	二叉搜索树的性质,右边比左边大
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null){
            return new TreeNode(val);
        }
//    	定义一个指针
    	TreeNode node=root;
//    	遍历到指针为空
    	while(node!=null) {
    		if (val<node.val) {
				if (node.left==null) {
					node.left=new TreeNode(val);
					break;
				}else {
					node=node.left;
				}
			}else {
				if (node.right==null) {
					node.right=new TreeNode(val);
					break;
				}else {
					node=node.right;
				}
			}
//    		node=val<node.val?node.left:node.right;
    	}
    	
    	
    	return root;
    	
    }
}
