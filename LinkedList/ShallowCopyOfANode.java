public class ShallowCopyOfANode {
    public static void main(String[] args) {
        Node a = new Node(10);
        System.out.println(a.val);
        
        // Node temp = a; // Shallow copy of node a
        Node temp = new Node(a.val); // deep copy of a node 
        System.out.println(temp.val); // Should print 10

        // Printing memory addresses
        System.out.println(a); // Will print memory address of a
        System.out.println(temp); // Will print memory address of temp (same as a)
    }
}
