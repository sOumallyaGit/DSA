class SinglyLinkedList{ // user defined data structure
    Node head;
    Node tail;
    void insertAtEnd(int val){
        Node temp = new Node(val);
        if(head == null){
            head = temp;
            tail = temp;
        }
        else{
            tail.next = temp;
            tail = temp;
        }
    }
}

public class implementationLL {
    public static void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        SinglyLinkedList LL = new SinglyLinkedList();
        LL.insertAtEnd(10);
        LL.insertAtEnd(20);
        LL.insertAtEnd(30);
        print(LL.head);
    }
}
 