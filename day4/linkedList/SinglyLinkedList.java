package classroom.day4.linkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class SinglyLinkedList {
    Node head;

    public void addNodeToEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void deleteNodeFromBeginning() {
        if (head != null) {
            head = head.next;
        } else {
            System.out.println("List is empty.");
        }
    }

    public void displayAllNodes() {
        if (head == null) {
            System.out.println("List is empty.");
        } else {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addNodeToEnd(1);
        list.addNodeToEnd(2);
        list.addNodeToEnd(3);
        System.out.println("List after adding nodes:");
        list.displayAllNodes();

        list.deleteNodeFromBeginning();
        System.out.println("List after deleting node from beginning:");
        list.displayAllNodes();
    }
}
