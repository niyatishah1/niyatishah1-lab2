public class TypeA extends Thing{
    //randomly choses left, right or straight at every round

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
