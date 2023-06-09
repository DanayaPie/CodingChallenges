package codingChallenges.Java;

public class MiddleLinkedList {

    // write a program to return the middle element of a given linked list

    MiddleLinkedListNode head;

    void push(int data) {

        MiddleLinkedListNode newNode = new MiddleLinkedListNode(data);
        newNode.next = head;
        head = newNode;
    }

    void printList() {

        MiddleLinkedListNode node = head;

        while (node != null) {
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.println("NULL");
    }

    void printMiddle() {

        MiddleLinkedListNode slowPtr = head;
        MiddleLinkedListNode fastPtr = head;

        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
        }

        System.out.println("Middle element is: " + slowPtr.data);
    }

    class MiddleLinkedListNode {

        int data;
        MiddleLinkedListNode next;

        MiddleLinkedListNode(int data) {

            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        MiddleLinkedList linkedList = new MiddleLinkedList();
        linkedList.push(6);
        linkedList.push(9);
        linkedList.push(1);
        linkedList.push(6);

        linkedList.printList();
        linkedList.printMiddle();
    }
}
