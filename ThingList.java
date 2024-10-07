import java.util.*;

public class ThingList {
    //public Random rand = new Random(System.currentTimeMillis());
    //Node L = null;
    //int count = 0;
    public Node head;
    private class Node {
        public Thing data;
        public Node next;
        public Node(Thing thing) {
            this.data = thing;
        }
    }

    public void addThing(Thing t) {
        Node temp = new Node(t);
        temp.next = head;
        head = temp;
    }

    public void printAll() {
        Node it = head;
        while(it.next != null) {
            System.out.println(it.data.row + " " + it.data.col + " " + it.data.lab);
            it = it.next;
        }
        
        System.out.println("done");
        System.out.flush();
    }

    public void moveAll() {
        // Move each thing.
        Node it = head;
        while(it.next != null) {
            //FIX
            maybeTurn(it.data);
            step(it.data);
            it = it.next;
        }
    }
}
