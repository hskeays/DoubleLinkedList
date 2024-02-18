public class DoubleLists {
    Node head;

    public void addToHead(int element) {
        // Create a new node n with the specified element
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
        Node n = new Node(element);

        if (head == null) {
            n.prev = null;
            head = n;
            return;
        }

        Node end = head;
        while (end.next != null) {
            end = end.next;
        }

        n.next = null;
        n.prev = end;
        end.next = n;
    }
}
