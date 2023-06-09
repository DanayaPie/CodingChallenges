package codingChallenges.Java;

public class ReverseLinkedList {

    // reversed a singly linked list
    public static void main(String[] args) {

        Node nodeHead = new Node(0);
        nodeHead.next = new Node(3);
        nodeHead.next.next = new Node(5);
        nodeHead.next.next.next = new Node(1);

        Node reverseHead = reverseLinkedList(nodeHead);

        while (reverseHead != null) {
            System.out.print(reverseHead.data + " ");
            reverseHead = reverseHead.next;
        }

    }

    private static Node reverseLinkedList(Node nodeHead) {

        Node prev = null;
        Node current = nodeHead;
        Node next;

        while (current != null) {

            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}

class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
