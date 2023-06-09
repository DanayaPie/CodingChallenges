package codingChallenges.Java;

public class IsCircularLinkedList {

    // find if the linked list is circular or not where an empty linked list is considered circular and all nodes have to be part of cycle

    IsCircularNode head;

    public static IsCircularNode newNode(int data) {

        IsCircularNode newNode = new IsCircularNode();
        newNode.data = data;
        newNode.next = null;

        return newNode;
    }

    public static Boolean isCircular(IsCircularNode head) {

        if (head == null) {
            return true;
        }

        IsCircularNode iterateNode = head.next;

        while (iterateNode != null && iterateNode != head) {

            iterateNode = iterateNode.next;
        }

        return (iterateNode == head);
    }

    public static void main(String[] args) {

        IsCircularNode head = newNode(2);
        head.next = newNode(4);
        head.next.next = newNode(3);

        System.out.println("Is circular: " + isCircular(head));

        // make circular linked list
        head.next.next.next = head;
        System.out.println("Is circular: " + isCircular(head));
    }
}

class IsCircularNode {

    int data;
    IsCircularNode next;

    IsCircularNode() {
    }

    IsCircularNode(int data) {
        this.data = data;
        this.next = null;
    }
}
