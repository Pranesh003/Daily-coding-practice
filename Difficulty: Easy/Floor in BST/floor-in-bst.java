/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public int findMaxFork(Node root, int k) {
        // code here.
        if(root==null)
        return -1;
        
        if(root.data==k)
        return root.data;
        
        if(root.data>k)
        return findMaxFork(root.left,k);
        
        int floor=findMaxFork(root.right,k);
        
        return (floor<=k && floor!=-1)?floor:root.data;
    }
}