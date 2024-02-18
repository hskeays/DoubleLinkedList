public class DoubleLists {
    Node head;

    public void addToHead(int element) {
        // Create a new node n with the specified element.
        Node n = new Node(element);
        // Set the next reference of the new node n to the current head,
        // effectively making the new node the new head.
        n.next = head;
        // Set the prev reference of the new node n to null because it is now the head.
        n.prev = null;
        // If the current head is not null (meaning the list was not empty),
        // set the prev reference of the existing head to the new node n.
        if (head != null) {
            head.prev = n;
        }
        // Update the head reference to point to the new node n.
        head = n;
    }

    public void addToTail(int element) {
        // Create a new node n with the specified element.
        Node n = new Node(element);
        Node end = head;
        // If the list is empty (head is null), set n.prev to null and update the head to be the new node n.
        // In this case, the new node becomes the only node in the list.
        if (head == null) {
            n.prev = null;
            head = n;
            return;
        }
        // If the list is not empty, traverse the list starting from the head to find the current tail.
        // This is done in the while loop, which stops when it reaches the end of the list.
        while (end.next != null) {
            end = end.next;
        }
        // Set the next reference of the new node n to null, indicating that it is the last node in the list.
        n.next = null;
        // Set the prev reference of the new node n to the current tail (the last node before adding the new one).
        n.prev = end;
        // Update the next reference of the current tail to point to the new node n,
        // establishing the link between the existing tail and the new node.
        end.next = n;
    }

    public void insertNode(Node prev, int element) {
        // Check if the prev node is null. If it is, print an error message and return,
        // as it's not possible to insert a new node after a null node.
        if (prev == null) {
            System.out.println("Cannot have previous node of null");
            return;
        }
        //Create a new node n with the specified element.
        Node n = new Node(element);
        // Update the next reference of the new node n to point to the node that comes after the prev node.
        n.next = prev.next;
        // Update the next reference of the prev node to point to the new node n,
        // effectively inserting the new node after the prev node.
        prev.next = n;
        // Set the prev reference of the new node n to the prev node,
        // establishing the link between the new node and the node before it.
        n.prev = prev;
        // If the new node n has a node after it (n.next is not null),
        // update the prev reference of the node after n to point to the new node n.
        if (n.next != null) {
            n.next.prev = n;
        }
    }

    public void printList(Node node) {
        System.out.println("Going forward --> ");
        // Initialize a reference end to null.
        Node end = null;
        // Traverse the list in the forward direction using the while loop. Print each node's data,
        // update the end reference to the current node, and move to the next node.
        while (node != null) {
            System.out.print(node.data + " ");
            end = node;
            node = node.next;
        }

        System.out.println("\n" + "<-- Going backward ");
        // Traverse the list in the backward direction using another while loop.
        // Print each node's data in reverse order by following the prev references.
        while (end != null) {
            System.out.print(end.data + " ");
            end = end.prev;
        }
    }
}
