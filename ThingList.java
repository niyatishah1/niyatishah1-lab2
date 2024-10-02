import java.util.Random;

public class ThingList {
    public Random rand = new Random(System.currentTimeMillis());
    Node L = null;
    int count = 0;

    public class Node {
        public Thing data;
        public Node head;
        public Node next;

    }

    public void addThing(Thing t) {
        // Every N rounds, add another typeA and typeB Thing.
        if( count % N == 0 ) {

            // Add a typeA thing to the list.
            // (GEE, THAT'S A LOT OF CODE FOR JUST CREATING ONE THING)
            Thing tA = new Thing();
            tA.row = 45;
            tA.col = 50;
            Node nA = new Node();
            nA.data = tA;
            nA.next = L;
            L       = nA;

            // Add a typeB thing to the list
            Thing tB = new Thing();
            tB.row     = 55;
            tB.col     = 50;
            tB.lab     = 'b';
            tB.isTypeB = true;
            Node nB = new Node();
            nB.data = tB;
            nB.next = L;
            L       = nB;
        }
    }

    public void printAll() {
        for( Node T = L; T != null; T = T.next )
        System.out.println(T.data.row + " " + T.data.col + " " + T.data.lab);
        System.out.println("done");
        System.out.flush();
    }

    public void moveAll(Random rand) {
        // Move each thing.
      // (SEEMS LIKE A NICE MOVEALL() METHOD CALL WOULD WORK HERE)
        for( Node T = L; T != null; T = T.next ) {
            maybeTurn(T.data);
            step(T.data);
        }
    }

}
