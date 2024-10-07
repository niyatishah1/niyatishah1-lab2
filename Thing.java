import java.util.*;
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
    protected int  row;
    protected int  col;
    protected int  dir;
    protected int  timeSinceLast;
    protected char lab;

    public Thing (int col, int row, int dir, char c) {
        this.col = col;
        this.row = row;
        this.dir = dir;
        this.lab = c;
    }

    public void rightTurn() {
        //sets dir to 1 (east)
        this.dir = (this.dir + 1) % 4;
    }
    
    public void leftTurn() {
        //sets dir to 3 (west)
        this.dir = (this.dir + 3) % 4;
    }
    
    public void step() {
        final int[] dc = {0, 1, 0, -1}, dr = {1, 0, -1, 0};
        this.row += dr[this.dir];
        this.col += dc[this.dir];
    }

    public abstract void maybeTurn(Random rand);
}
