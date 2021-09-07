package CphBusiness;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListTest {

    List list = new List();

    @Test
    void insertFromHead(){
        Node node = new Node("Vincent");
        Node node1 = new Node("Thomas");


        assertEquals("Vincent", list.insertFromHead(node).name);
        assertEquals("Thomas", list.insertFromHead(node1).name);
    }

    @Test
    void insertFromTail(){
        Node node = new Node("Vincent");
        Node node1 = new Node("Thomas");


        assertEquals("Vincent", list.insertFromTail(node).name);
        assertEquals("Thomas", list.insertFromTail(node1).name);
    }

}