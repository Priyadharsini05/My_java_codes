//this code is in progress. not sure about the output.

import java.util.*;
class Node{
    int val, height;
    Node left, right;
    
    Node(int val){
        this.val = val;
        left = null;
        right = null; 
        height = 1;
    }
}
class AVL{
    int get_height(Node node)
    {
        return node == null ? 0 : node.height;
    }
    int getbal(Node node)
    {
        return node == null ? 0 : get_height(node.left) - get_height(node.right);
    }
    Node right(Node y)
    {
        Node x = y.left;
        x.right = y;
        return x;
    }
    Node left(Node y)
    {
        Node x = y.right;
        x.left = y;
        return x;
    }
    Node leftright(Node y)
    {
        y.left = left(y.left);
        return right(y);
    }
    Node rightleft(Node y)
    {
        y.right = right(y.right);
        return left(y);
    }
    
    Node insert(Node node, int val)
    {
        if(node == null)
        {
            return new Node(val);
        }
        if(val < node.val)
        {
            node.left = insert(node.left, val);
        }
        else if(val > node.val)
        {
            node.right = insert(node.right, val);
        }
        else
        {
            return node;
        }
        
        int height = Math.max(get_height(node.left), get_height(node.right)) + 1;
        int balance = getbal(node);
        
        if(balance == 2 && val < node.left.val)
        {
            node = right(node);
        }
        else if(balance == -2 && val > node.left.val)
        {
            node = left(node);
        }
        else if(balance == 2 && val > node.left.val)
        {
            node = leftright(node);
        }
        else if(balance == 2 && val < node.left.val)
        {
            node = rightleft(node);
        }
        else
        {
            return node;
        }
    }
}
public class Main
{
    public static void main(String args[])
    {
        AVL t = new AVL();
        Node node = null;
        int[] a = {23, 56, 6, 7, 8, 2, 98, 45, 78, 34, 55, 7};
        for(int i : a)
        {
            node = t.insert(node, i);
        }
        //t.inorder(node);
    }
}
