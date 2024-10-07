import java.util.*;

public class TypeC extends Thing{
  public TypeC () {
      super(50, 50, 3, 'y');
  }
  //Now that you have a nice object-oriented version, create a third type of Thing called TypeC. 
  //What exactly it does is up to you, but it needs to use some diagonal motion 
  //(i.e. left-right-left-right-… sequences, or draws a circle, triangle, or other shape). 
  public Random rand = new Random(System.currentTimeMillis());

  public void maybeTurn(Random rand) {
    int i = rand.nextInt(4);
    if(i == 1) {
      rightTurn();
    }
    if(i == 0 || i == 2) {
      step();
    }
    if(i == 4) {
      leftTurn();
    }
    step();
  }
}
