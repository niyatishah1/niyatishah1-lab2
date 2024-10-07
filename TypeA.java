import java.util.*;

public class TypeA extends Thing{
    public TypeA(int col, int row) {
        super(col,row, 3, 'y');
    }
    //randomly choses left, right or straight at every round
    public Random rand = new Random(System.currentTimeMillis());
    public void maybeTurn(Thing t) {
        int i = rand.nextInt(3);

        if (i == 1) {
            rightTurn(t);
        }

        if (i == 2) {
            leftTurn(t);
        }
    }

}
