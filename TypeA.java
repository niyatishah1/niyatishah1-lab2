import java.util.*;

public class TypeA extends Thing{
    public TypeA() {
        super(45, 50, 3, 'r');
    }
    //randomly choses left, right or straight at every round
    public Random rand = new Random(System.currentTimeMillis());
    public void maybeTurn(Random rand) {
        int i = rand.nextInt(3);

        if (i == 1) {
            rightTurn();
        }

        if (i == 2) {
            leftTurn();
        }
    }

}
