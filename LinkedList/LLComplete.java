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

    void insert(int index,int value){
        if(index==0){
            insertAtHead(value);
            return;
        }
        if(index==size){
            insertAtTail(value);
            return;
        }
        if(index<0 || index>size){
            System.out.println("Invalid Index");
            return ;
        }
        LLNode temp = new LLNode(value);
        LLNode x = head;
        for(int i = 1 ; i<index ; i++){
            x = x.next;
        }
        temp.next=x.next;
        x.next=temp;
        size++;
    }
}

public class LLComplete {
    public static void main(String[] args) {
        SinglyLL LinkedList1 = new SinglyLL();
        LinkedList1.insertAtTail(3);
        LinkedList1.insertAtTail(4);
        LinkedList1.insertAtTail(5);
        LinkedList1.insertAtHead(1);
        LinkedList1.Display();
        LinkedList1.Length();

        LinkedList1.insert(1,2);
        LinkedList1.Display();
    }
}
