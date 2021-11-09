package 图;

import java.util.List;

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};

/*
 * 二叉树的前序遍历： https://leetcode-cn.com/problems/binary-tree-preorder-traversal/ （递归+迭代）
◼ 二叉树的中序遍历： https://leetcode-cn.com/problems/binary-tree-inorder-traversal/ （递归+迭代）
◼ 二叉树的后序遍历： https://leetcode-cn.com/problems/binary-tree-postorder-traversal/ （递归+迭代）
◼ 二叉树的层次遍历： https://leetcode-cn.com/problems/binary-tree-level-order-traversal/ （迭代）
◼ 二叉树的最大深度： https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/ （递归+迭代）

 *◼ 二叉树的层次遍历II： https://leetcode-cn.com/problems/binary-tree-level-order-traversal-ii/
◼ 二叉树最大宽度：https://leetcode-cn.com/problems/maximum-width-of-binary-tree/
◼ N叉树的前序遍历： https://leetcode-cn.com/problems/n-ary-tree-preorder-traversal/
◼ N叉树的后序遍历： https://leetcode-cn.com/problems/n-ary-tree-postorder-traversal/
◼ N叉树的最大深度： https://leetcode-cn.com/problems/maximum-depth-of-n-ary-tree/

 * ◼ 二叉树展开为链表
https://leetcode-cn.com/problems/flatten-binary-tree-to-linked-list/
◼ 从中序与后序遍历序列构造二叉树
https://leetcode-cn.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/
◼ 从前序与中序遍历序列构造二叉树
https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
◼ 根据前序和后序遍历构造二叉树
https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-postorder-traversal/
◼ 对称二叉树
https://leetcode-cn.com/problems/symmetric-tree/
 */