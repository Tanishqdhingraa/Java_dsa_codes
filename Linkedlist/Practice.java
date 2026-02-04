package Linkedlist;

public class Practice {
    // Node structure 
    static class  Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;

    public void insertAtStart(int data){
        // made new node 
        Node newNode = new Node(data);
        // putted it at the first 
        newNode.next=head;
        // made it as head 
        head=newNode;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
        System.out.println("null");

    }

    public void insertAtEnd(int data){
        Node lastnode = new Node(data);
        if(head==null){
            head=lastnode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = lastnode;
        
    }

    public static void main(String[] args) {
        Practice list = new Practice();

        list.insertAtStart(15);
        list.insertAtStart(65);
        list.insertAtStart(95);
        list.insertAtStart(10);

        list.display();
    }
}
