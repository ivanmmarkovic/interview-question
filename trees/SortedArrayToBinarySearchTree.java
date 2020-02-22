/*

https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/

Runtime: 0 ms, faster than 100.00% of Java online submissions 
for Convert Sorted Array to Binary Search Tree.
Memory Usage: 41.3 MB, less than 5.16% of Java online submissions 
for Convert Sorted Array to Binary Search Tree.

Given an array where elements are sorted in ascending order, convert it to a height balanced BST.

For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.

Example:

Given the sorted array: [-10,-3,0,5,9],

One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:

      0
     / \
   -3   9
   /   /
 -10  5

*/

class SortedArrayToBinarySearchTree {

    class TreeNode{
		int value;
		TreeNode left, right, parent;
		public TreeNode(int value) {
			this.value = value;
		}
	}


    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }
    
    public TreeNode helper(int nums[], int start, int end){
        if(start > end)
            return null;
        else {
            int midpoint = start + (end - start) / 2;
            TreeNode root = new TreeNode(nums[midpoint]);
            root.left = helper(nums, start, midpoint - 1);
            root.right = helper(nums, midpoint + 1, end);
            return root;
        }
    }

}