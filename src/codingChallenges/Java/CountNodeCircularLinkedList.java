package codingChallenges.Java;

import java.util.concurrent.Callable;

public class CountNodeCircularLinkedList {

    // given a circular linked list, count the number of nodes

    CountCircularNode head = null;
    CountCircularNode tail = null;

    public void push(int data) {

        CountCircularNode newNode = new CountCircularNode(data);

        if (head != null) {

            newNode.next = head;
            head = newNode;
            tail.next = head;

        } else {

            head = newNode;
            tail = newNode;
            newNode.next = head;
        }
    }

    public void printList() {

        CountCircularNode current = head;

        if (head != null) {

            do {
                System.out.print(current.data + " -> ");
                current = current.next;

            } while (current != head);
        }
        System.out.println();
    }

    public int countNode() {

        int count = 0;

        if (head != null) {

            CountCircularNode current = head;

            while (current.next != head) {

                current = current.next;
                count++;
            }

            count++;
        }

        return count;
    }

    public static void main(String[] args) {

        CountNodeCircularLinkedList linkedList = new CountNodeCircularLinkedList();
        linkedList.push(3);
        linkedList.push(5);
        linkedList.push(2);
        linkedList.push(0);

        linkedList.printList();
        System.out.println("Number of node(s): " + linkedList.countNode());
    }
}

class CountCircularNode {

    int data;
    CountCircularNode next;

    CountCircularNode(int data) {
        this.data = data;
        this.next = null;
    }
}
