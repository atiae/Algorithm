package leetcode;

import java.util.ArrayList;
import java.util.List;

public class leet95 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){};
        TreeNode(int val){
            this.val = val;
        }
        TreeNode(int val,TreeNode left,TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<TreeNode> generateTrees(int n) {
        List<TreeNode> ans = new ArrayList<TreeNode>();
        if(n==0){
            return ans;
        }
        return getAns(1,n);
    }

    public List<TreeNode> getAns(int start,int end){
        List<TreeNode> ans = new ArrayList<TreeNode>();
        if(start > end){
            ans.add(null);
            return ans;
        }
        if(start == end ){
            TreeNode tree = new TreeNode(start);
            ans.add(tree);
            return ans;
        }
        for(int i=start;i<=end;i++){
            List<TreeNode> leftTrees = getAns(start,i-1);
            List<TreeNode> rightTrees = getAns(i+1,end);
            for(TreeNode leftTree:leftTrees){
                for(TreeNode rightTree:rightTrees){
                    TreeNode root = new TreeNode(i);
                    root.left=leftTree;
                    root.right = rightTree;
                    ans.add(root);
                }
            }
        }
        return ans;

    }
    
} 