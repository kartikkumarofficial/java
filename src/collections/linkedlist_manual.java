package collections;
public class linkedlist_manual {
    public static void main(String[] args) {

        Node node1 = new Node();
        Node node2 = new Node();
        node1.value=1;
        node1.next=node2;
        //single element linkedlist
        node2.value=2;
        node2.next=null;
        insertAtEnd(node1,4);
        insertAtBeg(node1,5);
        node1 = insertAtBeg(node1, 0);
        printList(node1);
        deleteNodebyVal(node1,0);
        printList(node1);

    }
    public static void printList(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("null");

    }
    public static void insertAtEnd(Node head,int val){

        Node newNode = new Node();
        newNode.value=val;
        newNode.next=null;
        Node temp = head;

        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;



    }
    public static Node insertAtBeg(Node head , int val){
        Node newNode = new Node();
        newNode.value=val;
        newNode.next=head;
        return newNode;

    }
    public static Node deleteNodebyVal(Node head , int val){
        if(head.value==val){
            //deletion at beg
            return head.next;
        }
        Node temp = head;
        while(temp.next!=null && temp.next.value!=val){
            temp = temp.next;
        }
        if (temp.next !=null){
            temp.next = temp.next.next;
        }
        return head;


    }

}


class Node{
    public int value;
    public Node next;

}