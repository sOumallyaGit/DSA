class Node{
    int val;
    Node next;
    Node (int val){
        this.val = val;
    }
}

public class ListNodeClass{
    public static void main(String[] args){

    // initialization
    Node a = new Node(10);
    Node b = new Node(20);
    Node c = new Node(30);
    Node d = new Node(40);
    Node e = new Node(50);

    System.out.println(a.val); // will print value
    System.out.println(b); // Will print memory address
    System.out.println(a.next); // will print null for now because link not done

    // now linking 
    a.next = b;
    b.next = c;
    c.next = d;
    d.next = e;

    System.out.println(a.next); // will print b address
    System.out.println(b); // will print b address
    System.out.println(b.next); // will print null

    // printing whole linkedlist using a only
    System.out.println(a.val);
    System.out.println(a.next.val);
    System.out.println(a.next.next.val);
    System.out.println(a.next.next.next.val);
    System.out.println(a.next.next.next.next.val);
    }
}