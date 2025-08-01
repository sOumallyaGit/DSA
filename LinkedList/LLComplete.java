class LLNode{
    int val;
    LLNode next;
    LLNode(int val){
        this.val = val;
    }
}

class SinglyLL{
    LLNode head;
    LLNode tail;
    int size;

    void insertAtTail(int val){
        LLNode temp = new LLNode(val);
        if(head == null){
            head = temp;
            tail = temp;
        }else{
            tail.next=temp;
            tail=temp;
        }
        size++;
    }
    
    void insertAtHead(int val){
        LLNode temp = new LLNode(val);
        if(head==null){
            head=temp;
            tail=temp;
        }else{
            temp.next=head;
            head = temp;
        }
        size++;
    }

    void Display(){
        LLNode temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    void Length(){
        System.out.println("The Length of your LinkedList is :"+size);
    }

    
}

public class LLComplete {
    public static void main(String[] args) {
        SinglyLL LinkedList1 = new SinglyLL();
        LinkedList1.insertAtTail(5);
        LinkedList1.insertAtTail(5);
        LinkedList1.insertAtTail(5);
        LinkedList1.insertAtHead(10);
        LinkedList1.Display();
        LinkedList1.Length();
    }
}
