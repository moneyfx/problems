/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func maxDepth(root *TreeNode) int {
    if root == nil {
        return 0
    }

    var l, r int

    if root.Left != nil {
        l = maxDepth(root.Left)
    }

    if root.Right != nil {
        r = maxDepth(root.Right)
    }

    if l == 0 && r == 0 {
        return 1
    }

    if l > r {
        return 1 + l
    }

    return 1 + r
}
