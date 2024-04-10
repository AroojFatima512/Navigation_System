public class Node {
    String url;
    Node next;
    Node prev;
    Node(String url){
        this.url = url;
        this.next=null;
        this.prev=null;
    }
}
