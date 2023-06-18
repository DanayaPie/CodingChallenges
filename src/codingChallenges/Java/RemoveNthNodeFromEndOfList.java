package codingChallenges.Java;

public class RemoveNthNodeFromEndOfList {

    // Given a linked list, remove the nth node from the end of the list and return its head

    NodeFromEndOfList head;

    public void push(int data) {

        NodeFromEndOfList newNode = new NodeFromEndOfList(data);

        newNode.next = head;
        head = newNode;
    }

    public void printList() {

        NodeFromEndOfList currentNode = head;

        while (currentNode != null) {

            System.out.print(currentNode.data + " --> ");
            currentNode = currentNode.next;
        }
    }

    public NodeFromEndOfList removeNodeFromEnd(int n) {

        NodeFromEndOfList slowPointer = head;
        NodeFromEndOfList fastPointer = head;

        // move fast pointer n step ahead
        for (int i = 0; i <= n; i++) {
            fastPointer = fastPointer.next;
        }

        while (fastPointer != null) {

            fastPointer = fastPointer.next;
            slowPointer = slowPointer.next;
        }

        // remove the end node
        slowPointer.next = slowPointer.next.next;

        return head;
    }


    public static void main(String[] args) {

        RemoveNthNodeFromEndOfList linkedList = new RemoveNthNodeFromEndOfList();
        linkedList.push(0);
        linkedList.push(1);
        linkedList.push(2);

        linkedList.removeNodeFromEnd(1);

        linkedList.printList();
    }

}

class NodeFromEndOfList {

    int data;
    NodeFromEndOfList next;

    NodeFromEndOfList(int data) {
        this.data = data;
        this.next = null;
    }
}
