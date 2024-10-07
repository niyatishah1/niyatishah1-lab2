import java.util.*;

public class TypeC extends Thing{
  public TypeC (int col, int row) {
      super(col, row, 3, 'y');
  }
  //Now that you have a nice object-oriented version, create a third type of Thing called TypeC. 
  //What exactly it does is up to you, but it needs to use some diagonal motion 
  //(i.e. left-right-left-right-… sequences, or draws a circle, triangle, or other shape). 
  public Random rand = new Random(System.currentTimeMillis());

  public void maybeTurn(Thing t) {
      //int i = rand.nextInt(3);
      rightTurn(t);
      step(t);
      leftTurn(t);
  }
}
