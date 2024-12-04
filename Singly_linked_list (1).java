import java.util.*;
class Node 
{
    int data;
    Node next;
    Node(int num)
    {
        this.data=num;
        this.next=null;
    }
}
public class Singly_linked_list
{
    Node head=null;
    Node temp=null;
    Node prev=null;
    public void sll(int num)
    {
        Node newnode = new Node(num);
        if(head==null)
        {
            head=temp=newnode;
        }
        else
        {
            temp.next=newnode;
            temp=newnode;
        }
    }
    public void start(int num)
    {
        Node newnode = new Node(num);
        newnode.data=num;
        newnode.next=head;
        head=newnode;
    }
    public void end(int num)
    {
        Node newnode = new Node(num);
        newnode.data=num;
        newnode.next=null;
        temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newnode;
        temp=newnode;
    }
    public void middle(int num)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the position: ");
        int pos=s.nextInt();
        Node newnode = new Node(num);
        newnode.data=num;
        temp=head;
        int i=1;
        while(i<pos)
        {
            prev=temp;
            temp=temp.next;
            i++;
        }
        prev.next=newnode;
        newnode.next=temp;
    }
    public void display()
    {
        temp=head;
        while(temp.next!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.print(temp.data);
    }
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		Singly_linked_list list = new Singly_linked_list();
		int num;
		while(true)
		{
		    num=s.nextInt();
		    if(num==-1)
		    {
		        break;
		    }
		    list.sll(num);
		}
		System.out.println("Enter the value of new node: ");
		int val=s.nextInt();
		System.out.println("Enter the choice: ");
		System.out.print("1.Start \n2.End\n3.Middle\n");
		int choice=s.nextInt();
		if(choice==1)
		{
		    list.start(val);
		}
		else if(choice==2)
		{
		    list.end(val);
		}
		else if(choice==3)
		{
		    list.middle(val);
		}
		else
		{
		    System.out.println("Wrong choice");
		}
		list.display();
	}
}