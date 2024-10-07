import java.util.*;

public class TypeB extends Thing{
    public TypeB() {
        super(55, 50, 3, 'b');
    }
    //TypeB, which randomly chooses left, right or straight every 10th round.
    public Random rand = new Random(System.currentTimeMillis());
    public void maybeTurn(Random rand) {
        int i = rand.nextInt(3);
    
        this.timeSinceLast++;
    
        if (this.timeSinceLast == 10) {
            this.timeSinceLast = 0;

            if (i == 1) {
                rightTurn();
            }

            if (i == 2) {
                leftTurn();
            }
        }
    }
}
