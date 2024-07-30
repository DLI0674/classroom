package classroom.day4.linkedList;

import java.util.LinkedList;

public class SinglyLinkedList {
    Node head;
    void addNode(int x){
        if(head==null){
            head=new Node(x);
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=new Node(x);
        }
    }
    void delete(){
        if(head==null){
            return;
        }
        head=head.next;
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        SinglyLinkedList list=new SinglyLinkedList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);
        list.delete();
        list.display();
    }
}
