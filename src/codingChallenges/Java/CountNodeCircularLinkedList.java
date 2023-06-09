package codingChallenges.Java;

public class CountNodeCircularLinkedList {

    // given a circular linked list, count the number of nodes

    CountCircularNode head;

    static CountCircularNode push(CountCircularNode head, int data) {

        // if linked list is not empty
        if (head != null) {

            CountCircularNode newNode = new CountCircularNode();
            newNode.data = data;
            newNode.next = head.next;
            head.next = newNode;

            // if linked list is empty
        } else {

            CountCircularNode newNode = new CountCircularNode();
            newNode.data = data;
            head = newNode;
            head.next = head;
        }

        return head;
    }

    static int countNode(CountCircularNode head) {

        int counter = 0;
        CountCircularNode iterateNode = head;

        if (head != null) {

            do {
                iterateNode = iterateNode.next;
                counter++;
            } while (iterateNode != head);
        }

        return counter;
    }

    public static void main(String[] args) {

        CountCircularNode head = null;
        head = push(head, 3);
        head = push(head, 9);

        System.out.println(countNode(head));
    }
}

class CountCircularNode {

    int data;
    CountCircularNode next;
}
