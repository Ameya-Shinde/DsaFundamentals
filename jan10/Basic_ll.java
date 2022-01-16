package jan10;

public class Basic_ll {
	public Node head;

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

	  public boolean search(Node head, int key) {
	    Node current = head;
	    while (current != null) {
	      if (current.data == key)
	        return true;
	      current = current.next;
	    }
	    return false;
	  }

	  public void printList() {
	    Node tnode = head;
	    while (tnode != null) {
	      System.out.print(tnode.data + " ");
	      tnode = tnode.next;
	    }

	  }

	  public static void main(String[] args) {
	    Basic_ll llist = new Basic_ll();

	    llist.insert(1);
	    llist.insert(2);
	    llist.insert(3);
	    llist.insert(4);
	    llist.insert(5);

	    System.out.println("Linked list: ");
	    llist.printList();

	    System.out.println("\nAfter deleting an element: ");
	    llist.delete(3);
	    llist.printList();

	    System.out.println();
	    int item_to_find = 3;
	    if (llist.search(llist.head, item_to_find))
	      System.out.println(item_to_find + " is found");
	    else
	      System.out.println(item_to_find + " is not found");

	    llist.printList();
	  }

}
