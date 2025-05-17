class Node
{
    public int data;
    public Node left;
    public Node right;
    
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
class Tree
{
    
    Node root = null;
    void insert(int data)
    {
        Node n = new Node(data);
        
        if(root == null)
        {
            root = n;
        }
        else
        {
            Node temp = root;
            while(true)
            {
                if(temp.data > data)
                {
                    if(temp.left == null)
                    {
                        temp.left = n;
                        break;
                    }
                    else
                    {
                        temp = temp.left;
                    }
                }
                else
                {
                    if(temp.right == null)
                    {
                        temp.right = n;
                        break;
                    }
                    else
                    {
                        temp = temp.right;
                    }
                }
            }
        }
        
    }
    void inorder(Node root)
    {
        if(root != null)
        {
            inorder(root.left);
            System.out.print(root.data+ " ");
            inorder(root.right);
        }
        
    }
    void preorder(Node root)
    {
        if(root != null){
        
            System.out.print(root.data+ " ");
            preorder(root.left);
            preorder(root.right);
        }
        
    }
    void postorder(Node root)
    {
        if(root != null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+ " ");
            
        }
        
    }
}
public class Main
{
    public static void main(String args[])
    {
        Tree t = new Tree();
        t.insert(100);
        t.insert(205);
        t.insert(56);
        t.insert(63);
        t.insert(12);
        t.insert(78);
        t.insert(75);
        t.insert(99);
        t.insert(210);
        t.insert(130);
        t.inorder(t.root);
        System.out.println();
        t.preorder(t.root);
        System.out.println();
        t.postorder(t.root);
        
    }
}
