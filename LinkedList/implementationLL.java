class SinglyLinkedList{ // user defined data structure
    Node head;
    Node tail;
    int size;
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
        size++;
    }
    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    void Size(){
        System.out.println("Your Linked List size is "+ size);
    }
    void insertAtHead(int val){
        Node temp = new Node(val);
        if(head == null){
            head = temp;
            tail = temp;
        }else{
            temp.next = head;
            head = temp;
        }
        size++;
    }

    void insertAtAny(int index, int val){
        if(index==0){
            insertAtHead(val);
            return;
        }
        if(index==size){
            insertAtEnd(val);
            return;
        }
        if(index<0 || index>size){
            System.out.println("Invalid Index");
            return ;
        }
        Node temp = new Node(val);
        Node x = head;//for traversing
        for(int i = 1;i<index;i++){
            x = x.next;
        }
        // insertion part
        temp.next=x.next;
        x.next=temp;
        size++;
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

        LL.insertAtHead(40);


        System.out.println("Displaying elements of the linked list:");
        LL.display();
        System.out.println("Adding more elements to the linked list:");
        LL.insertAtEnd(24);
        LL.display(); // Displaying the linked list using the display method);
        LL.Size(); // Displaying the size of the linked list

        LL.insertAtAny(2,100);
        LL.display();
    }
}
 