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
    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
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
        System.out.println("Displaying elements of the linked list:");
        LL.display();
        System.out.println("Adding more elements to the linked list:");
        LL.insertAtEnd(24);
        LL.display(); // Displaying the linked list using the display method);
    }
}
 