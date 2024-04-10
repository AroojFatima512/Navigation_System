package Navigation;

public class Navigation {
       class Node{
           String url;
           Node next;
           Node prev;
           Node(String url){
               this.url = url;
               this.next = null;

               this.prev = null;
           }
       }
       Node head;
       Node tail;
       void add(String url){
           Node node = new Node(url);
           if(head == null){
               head = tail = node;
               return;
           }
           tail.next = node;
           node.prev = tail;
           tail = node;
       }
       void moveForward(String url){
           add(url);
           System.out.println(url);
       }

       void moveBackward(){
           if (head == null){
               return;
           }
           Node back = tail.prev;
           tail = null;
           tail = back;
           System.out.println(back.url);
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
    public static void main(String[] args) {
        Navigation navigation = new Navigation();
        navigation.add("www.google.com");
        navigation.add("www.chrome.com");
        navigation.moveForward("www.w3.com");
//        navigation.print();
        navigation.moveBackward();
    }
}
