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
            node.next = head;
            head = node;
            return head;
        }
    }

    public Node insertFromTail(Node node) {
        if (head == null){
            head = node;
            tail = node;
            return head;
        }
        else {
            tail.next = node;
            tail = node;
            return tail;
        }
    }

    public String printNodesFromHead(){
        Node node = this.head;

        String res = "";

        while (node != null){
            res = res + node.name;
            node = node.next;
        }
        return res;
    }


    public String printNodesFromTail(){
        Node node = this.tail;

        String res = "";

        while (node != null){
            res = res + node.name;
            node = node.prev;
        }
        return res;
    }

    public Node removeFromHead(){

        if (head == null){
            return null;
        }
        if (head == tail){
            return head;
        }

        Node removed = head;
        head.next.prev = null;
        head = head.next;

        return removed;
    }

}
