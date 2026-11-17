/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        left = right = null;
    }
} */

class Solution {
    int findCeil(Node root, int x) {
        // code here
        if(root==null)
        return -1;
        
        if(root.data==x)
        return root.data;
        
        if(root.data<x)
        return findCeil(root.right,x);
        
        int ceil=findCeil(root.left,x);
        
        return (ceil >=x) ? ceil:root.data;
    }
}