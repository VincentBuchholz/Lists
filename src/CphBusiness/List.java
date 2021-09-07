package CphBusiness;

public class List {
    Node head = null;
    Node tail = null;

    public Node insertFromHead(Node node){
        if (head == null){
            head = node;
            tail = node;
            return head;
        }
        else {
            head.prev = node;
            head = node;
            return head;
        }
    }
}
