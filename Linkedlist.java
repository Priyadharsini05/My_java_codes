class Linkedlist
{
    Node head;
    class Node
    {
        int data;
        Node next;
        
        Node(int val)
        {
            data = val;
            next = null;
        }
    }
    Linkedlist()
    {
        head = null;
    }
    void insert(int val)
    {
        Node newnode = new Node(val);
        if(head == null)
        {
            head = newnode;
            return;
        }
        else
        {
            newnode.next = head;
            head = newnode;
        }
    }
    void delete(int pos)
    {
        Node temp = head;
        for(int i = 1; i< pos; i++)
        {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        
    }
    void display(){
        Node temp = head;
        while(temp != null){
        System.out.print(temp.data+"--> ");
        temp = temp.next;
        }
    }
}

public class Main
{
    public static void main(String args[])
    {
        Linkedlist l = new Linkedlist();
        l.insert(100);
        l.insert(200);
        l.insert(300);
        l.insert(400);
        l.display();
        l.delete(2);
        System.out.println(" ");
        l.display();
    }
}
