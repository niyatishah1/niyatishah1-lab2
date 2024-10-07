import java.util.*;

public class DotChaser {
  public static Random rand = new Random(System.currentTimeMillis());
  public static void main(String[] args) {
    int N = 200;

    if( args.length != 0 ) {
      N = Integer.parseInt(args[0]);
    }

    // INSTEAD OF A NODE, CREATE SOMETHING MORE USER-FRIENDLY.
    ThingList list = new ThingList();
    int count = 0;

    while( true ) {
      // Every N rounds, add another typeA and typeB Thing.
      if( count % N == 0 ) {
        list.addThing(new TypeA());
        list.addThing(new TypeB());
        list.addThing(new TypeC());
      }
      list.printAll();
      list.moveAll(rand);
      count++;
    }
  }
}
