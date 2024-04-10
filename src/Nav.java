public class Nav {
    Node head;
    Node tail;
    void insert(String n) {
        Node node = new Node(n);
        if (head == null) {
            head = tail = node;
            return;
        }
        tail.next = node;
        node.prev = tail;
        tail = node;
    }

    void forward(){
        Node cur = head;
        while (cur!=null){
            System.out.println(cur.url+ " ");
            cur= cur.next;
        }
        System.out.println();

    }

    void backward() {
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }
        if (tail.prev == null) {
            System.out.println("List is empty");
            head = tail = null;
            return;
        }
        tail = tail.prev;
        System.out.println(tail.url);
        tail.next = null;
    }

    public void print(){
            if(head == null){
                System.out.println("List is empty");
                return;
            }
            Node cur = head;
            while (cur != null){
                System.out.print(cur.url+ " -> ");
                cur = cur.next;
            }
            System.out.println("NULL");
        }

}
