package linkedlist;

public class linklist {
    public class linkedlist {
        public static void main(String[] args) {
            Node a = new Node(10);
            Node b = new Node(20);
            Node c = new Node(30);
            Node d = new Node(40);
    
            a.next = b;
            b.next = c;
            c.next = d;
    
            Node temp = a;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
        static class Node {
            int data;
            Node next;
        
            Node(int v) {
                this.data = v;
            }
        }
}
}
