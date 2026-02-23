package Doubly_LL;

public class E {
    //! Random NODE WILL BE GIVEN YOU HAVE TO PRINT WHOLE LL 
    public static class Node {
        int val;
        Node prev;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static void AnynodeWillbegivenprintLL(Node random) {
        Node temp = random;
        while(temp.prev !=null){
            temp = temp.prev;
        }
        System.out.print("null -> ");
        while(temp!=null){
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }
        System.out.println("null");

    }

    public static void main(String[] args) {

        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(99);
        Node e = new Node(13);

        a.prev = null;
        a.next = b;

        b.prev = a;
        b.next = c;

        c.prev = b;
        c.next = d;

        d.prev = c;
        d.next = e;

        e.prev = d;
        e.next = null;

        AnynodeWillbegivenprintLL(c);

    }
}