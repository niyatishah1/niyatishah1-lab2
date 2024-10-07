import java.util.*;

public class TypeB extends Thing{
    public TypeB() {
        super(55, 50, 3, 'b');
    }
    //TypeB, which randomly chooses left, right or straight every 10th round.
    public Random rand = new Random(System.currentTimeMillis());
    public void maybeTurn(Thing t) {
        int i = rand.nextInt(3);
    
        t.timeSinceLast++;
    
        if (t.timeSinceLast == 10) {
            t.timeSinceLast = 0;

            if (i == 1) {
                rightTurn(t);
            }

            if (i == 2) {
                leftTurn(t);
            }
        }
    }
}
