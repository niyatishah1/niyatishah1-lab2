public abstract class Thing extends ThingList{
     /**
   * A "Thing" moves in a grid world. A TypeA Thing randomly
   * decides to turn left or right (or not turn) every "round",
   * and, afterward, takes a step forward.  A TypeB Thing
   * only considers making a random turn every 10th round.
   **/
    //should not have any if statements, everything done through polymorphism
    //don't use static methods, other than public static void main

    // dir: 0=North, 1=East, 2=South, 3=West.
    // timeSinceLast: this is only important for "TypeB" Things.
    public int  row, col, dir, timeSinceLast;
    public char color = 'r';

    public Thing (int col, int row, int dir, char c) {
        this.col = col;
        this.row = row;
        this.dir = dir;
        this.color = c;
    }

    public void rightTurn(Thing t) {
        //sets dir to 1 (east)
        t.dir = (t.dir + 1) % 4;
    }
    
    public void leftTurn(Thing t) {
        //sets dir to 3 (west)
        t.dir = (t.dir + 3) % 4;
    }
    
    public void step(Thing t) {
        final int[] dc = {0, 1, 0, -1}, dr = {1, 0, -1, 0};
        t.row += dr[t.dir];
        t.col += dc[t.dir];
    }

    public abstract void maybeTurn(Thing t);
}
