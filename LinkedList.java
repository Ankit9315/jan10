package dsa;

import java.util.Scanner;

public class LinkedList {
   static Node head; 
    static class Node {
   
        int data;
        Node next;
   
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    
    void deletion(int key)
    {
        Node temp = head, prev = null;
        if (temp != null && temp.data == key) {
            head = temp.next; 
            return;
        }
        }
    public boolean search(Node head, int x)
    {
        Node current = head;   
        while (current != null)
        {
            if (current.data == x)
                return true;    
            current = current.next;
        }
        return false;   
    }
    public static LinkedList insertNth(LinkedList list ,int data, int position) {
        
        Node node = new Node(data);
        node.data = data;
        node.next = null;


        if (list.head == null) {
           
        	
            if (position != 0) {
                return list;
            } else { 
                list.head = node;
            }
        }

        if (head != null && position == 0) {
            node.next = list.head;
            list.head = node;
            return list;
        }

        Node current = list.head;
        Node previous = null;

        int i = 0;

        while (i < position) {
            previous = current;
            current = current.next;

            if (current == null) {
                break;
            }

            i++;
        }

        node.next = current;
        previous.next = node;
		return list;
    }
    public static LinkedList insert(LinkedList list, int data)
    {
        Node new_node = new Node(data);
        new_node.next = null;
        if (list.head == null) {
            list.head = new_node;
        }
        else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }
    public static void printList(LinkedList list)
    {
        Node currNode = list.head;
    
        System.out.print("LinkedList: ");

        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }
    static void printatanyindex(Node l1, Node l2)
    {
        Node temp = l1;
        Node temp1 = l2;
        while (temp != null)
        {
            int i = 1;
            while (i < temp.data)
            {
                temp1 = temp1.next;
                i++;
            }
            System.out.print( temp1.data + " ");
            temp = temp.next;
            temp1 = l2;
        }
    }
    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
        LinkedList list = new LinkedList();
        
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        list = insert(list, 7);
        list = insert(list, 8);
        
        int a=sc.nextInt();
        int b=sc.nextInt();
        list=insertNth(list,a,b);
        printList(list);
    }
}
