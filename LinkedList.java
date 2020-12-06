import java.util.*;
class Node
{
    int data;
    Node next;
    Node(int d)
    {
       data=d;
       next=null;
    }
}
class LinkedList
{
    Node head=null;
    static Node l;
    
	public static void main(String args[])throws Exception
    {
        LinkedList list=new LinkedList();
        Node head2;
        list.addNode(100);
        list.addNode(200);
        list.addNode(300);
        list.addNode(400);
        list.addNode(500);
        list.addNode(600);
        list.traverse(list.head);
        list.reverse(list.head);
    
	}
    void addNode(int d)
    {
        Node ptr=new Node(d);
        ptr.next=head;
        head=ptr;
    }
    void detectloop(Node head)
    {
        Node ptr1,ptr2;
        int flag=0,count=1;
        ptr1=head;
        ptr2=head;
        while(ptr1!=null&&ptr2!=null&&ptr2.next!=null)
        {
            ptr1=ptr1.next;
            ptr2=ptr2.next.next;
            if(ptr1==ptr2)
            {
                System.out.println("Loop Detected");
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            ptr1=head;
         while(ptr1!=ptr2)   
         {
              ptr1=ptr1.next;
              ptr2=ptr2.next;
         }
            System.out.println("Start of loop"+ptr1.data);
        /*ptr2=ptr2.next;
        while(ptr1!=ptr2)
        {
            count++;
            ptr2=ptr2.next;
        }
         System.out.println(count);
        }*/
        if(flag==0)
            System.out.println("No Loop");
        }
       
    }
    void reverse(Node head)
    {
        if(head==null)
        {
            return ;
        }
        reverse(head.next);
        System.out.println(head.data);        
    }
    boolean pallindrome(Node head)
    {
        if(head==null)
            return true;
         
        if(pallindrome(head.next)==true)
        {
           
            System.out.println(l.data+" "+head.data);
             if(l.data==head.data)
             {
                 l=l.next;
                 return true;
             }
            else
            return false;
           
        }
        else return false;
    }
    void removeDuplicates(Node head)
    {
        Node p,q;
        p=head;
        q=null;
        if(head==null)
            return;
        while(p.next!=null)
        {
            q=q.next;
            if(p.data==q.data)
            {
                p.next=q.next;
                q=p;
            }
            else
            {
                p=q;
            }
        }
    }
    void removeunsortedDuplicates(Node head)
    {
        Node p,q;
        p=head;
        q=head;
        HashSet<Integer> hash=new HashSet();
        while(p!=null)
        {
           if(hash.contains(p.data))
           {
               p=p.next;
           }
           else
           {
               hash.add(p.data);
               p=p.next;
           }
        }
        Iterator<Integer> it=hash.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
   
    void traverse(Node head)
    {
        while(head!=null)
        {
            System.out.println(head.data);
            head=head.next;
        }
    }
    
}