package codingChallenges.Java;

import java.util.concurrent.Callable;

public class CountNodeCircularLinkedList {

    // given a circular linked list, count the number of nodes

    CountCircularNode head;

    void push(int data) {

        if (head != null) {

            CountCircularNode newNode = new CountCircularNode(data);
            newNode.next = head.next;
            head.next = newNode;
            head = newNode;
        } else {

            CountCircularNode newNode = new CountCircularNode(data);
            head = newNode;
            head.next = head;
        }
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
