class Main {
    public static void main(String[] args) {
        // Create a doubly linked list (myList).
        DoubleLists myList = new DoubleLists();
        // Add the element 50 to the head of the list,
        // resulting in the list: 50 -> NULL.
        myList.addToHead(50);
        // Add the element 100 to the tail of the list,
        // resulting in the list: 50 -> 100 -> NULL.
        myList.addToTail(100);
        // Add the element 25 to the head of the list,
        // resulting in the list: 25 -> 50 -> 100 -> NULL.
        myList.addToHead(25);
        // Insert the element 75 after the node with the value 50,
        // resulting in the list: 25 -> 50 -> 75 -> 100 -> NULL.
        myList.insertNode(myList.head.next, 75);
        // Print the list in both forward and backward directions.
        myList.printList(myList.head);
    }
}
