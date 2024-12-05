/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

/**
 *
 * @author Administrator
 */
public class SingLyLinkedList {

    Node head;

    public SingLyLinkedList() {
        this.head = null;
    }

    public void Insert(int data) {
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

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    

    public static void main(String[] args) {
        SingLyLinkedList list = new SingLyLinkedList();
        list.Insert(10);
        list.Insert(20);
        list.Insert(30);
        System.out.print("Linked List: ");
        list.display();
    }
}
