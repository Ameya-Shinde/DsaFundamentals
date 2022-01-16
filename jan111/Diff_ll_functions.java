package jan111;


public class Diff_ll_functions {
	
	static Node head;

	  class Node {
	    int data;
	    Node next;

	    Node(int d) {
	      data = d;
	      next = null;
	    }
	  }

	  public void insert(int new_data) {
	    Node new_node = new Node(new_data);

	    if (head == null) {
	      head = new Node(new_data);
	      return;
	    }

	    new_node.next = null;

	    Node last = head;
	    while (last.next != null)
	      last = last.next;

	    last.next = new_node;
	    return;
	  }

	  void delete(int position) {
	    if (head == null)
	      return;

	    Node temp = head;

	    if (position == 0) {
	      head = temp.next;
	      return;
	    }
	    for (int i = 0; temp != null && i < position - 1; i++)
	      temp = temp.next;

	    if (temp == null || temp.next == null)
	      return;

	    Node next = temp.next.next;
	    temp.next = next;
	  }
	  void searchKth(int n)
	    {
	        int len = 0;
	        Node temp = head;
	        while (temp != null) {
	            temp = temp.next;
	            len++;
	        }
	        if (len < n)
	            return;
	 
	        temp = head;
	        for (int i = 1; i < len - n + 1; i++)
	            temp = temp.next;
	 
	        System.out.println(temp.data);
	    }
	  
	  public Node getIntersection(Node headA, Node headB) {
	        Node aTemp = headA;
	        Node bTemp = headB;
	        int aLength = 1;
	        int bLength = 1;
	        while(aTemp != null) {
	            aTemp = aTemp.next;
	            aLength++;
	        }
	        while(bTemp != null) {
	            bTemp = bTemp.next;
	            bLength++;
	        }
			
	        int skip = aLength - bLength;
	        if (skip < 0) {
	            skip *= -1;
	            while(skip > 0) {
	                headB = headB.next;
	                skip--;
	            }
	        } 
	        else {
	            while(skip > 0) {
	                headA = headA.next;
	                skip--;
	            }
	        }
	        while (headA != null && headB != null) {
	            if (headA == headB) return headA;
	            headA = headA.next;
	            headB = headB.next;
	        }
	        return null;
	    }
	  public static Node deleteduplicates(Node head) {
	        if(head == null || head.next == null){
	            return head;
	        }
	        
	        Node first = head;
	        Node second = head;
	        
	        while(second != null){
	            
	            while(second != null && first.data == second.data){
	                second = second.next;
	            }
	            first.next = second;
	            first = second;
	        }
	        
	        return head;
	    }
	  public Node mergell(Node list1,Node list2) {
          Node l1 = list1;
          Node l2 = list2;
          Node head = new Node(-1);
          Node curr = head;
          while (l1 != null && l2 != null) {
                if (l1.data < l2.data) {
                      curr.next = l1;
                      l1 = l1.next;
                } else {
                      curr.next = l2;
                      l2 = l2.next;
                }
                curr = curr.next;
          }
          if (l1 == null) {
                curr.next = l2;
          } else {
                curr.next = l1;
          }
          return head.next;
    }
	  

	  public void printList() {
	    Node tnode = head;
	    while (tnode != null) {
	      System.out.print(tnode.data + " ");
	      tnode = tnode.next;
	    }

	  }

	  public static void main(String[] args) {
		  Diff_ll_functions llist = new Diff_ll_functions();

	    llist.insert(1);
	    llist.insert(2);
	    llist.insert(3);
	    llist.insert(4);
	    llist.insert(4);

	    System.out.println("Linked list: ");
	    llist.printList();

	    System.out.println();
	    
	    int item_to_find = 3;
	    llist.searchKth(item_to_find);
	    
	    deleteduplicates(head);

	    llist.printList();
	  }

}
