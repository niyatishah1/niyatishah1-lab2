import java.util.Random;

public class TypeC extends Thing{
    //Now that you have a nice object-oriented version, create a third type of Thing called TypeC. 
    //What exactly it does is up to you, but it needs to use some diagonal motion 
    //(i.e. left-right-left-right-… sequences, or draws a circle, triangle, or other shape). 
    public Random rand = new Random(System.currentTimeMillis());

    public void maybeTurn(Thing t) {
        int i = rand.nextInt(3);
    
        if (t.isTypeB) {
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
        else   {
            if (i == 1) {
                rightTurn(t);
            }

            if (i == 2) {
                leftTurn(t);
            }
        }
    }
}
