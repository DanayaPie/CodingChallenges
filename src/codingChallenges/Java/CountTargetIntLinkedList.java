package codingChallenges.Java;

public class CountTargetIntLinkedList {

    // write a function that counts the number of time a target in occurs in a Linked List

    CountTargetNode head;

    void push(int data) {

        CountTargetNode newNode = new CountTargetNode(data);
        newNode.next = head;
        head = newNode;
    }

    void print() {

        CountTargetNode node = head;

        while (node != null) {
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.println("null");
    }

    // count target int
    int countTarget(int target) {

        CountTargetNode node = head;
        int count = 0;

        while (node != null) {

            if (node.data == target) {
                count++;
            }
            node = node.next;
        }

        return count;
    }

    public static void main(String[] args) {

        CountTargetIntLinkedList linkedList = new CountTargetIntLinkedList();
        linkedList.push(3);
        linkedList.push(2);
        linkedList.push(3);
        linkedList.push(3);
        linkedList.push(1);
        linkedList.push(3);

        linkedList.print();

        System.out.println("Target count: " + linkedList.countTarget(3));
    }
}

class CountTargetNode {

    int data;
    CountTargetNode next;

    public CountTargetNode(int data) {
        this.data = data;
        this.next = null;
    }
}
