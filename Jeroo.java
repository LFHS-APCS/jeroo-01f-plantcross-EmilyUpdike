/**
 * Put your Jeroo methods in this class.
 * @author Steve Aronson
 */
public class Jeroo extends JerooBase {

    
    public void plantCross() {
        
    }
    // Put any helpermethods here
  public void hopX6() {
  hop();
  hop();
  hop();
  hop();
  hop();
  hop();
 
}

public void hopX3(){
  hop();
  hop();
  hop();
}

public void hopPlantX3(){
  hop();
  plant();
  hop();
  plant();
  hop();
  plant();
}

public void hopPlantX2(){
  hop();
  plant();
  hop();
  plant();
}

public void hopPlantX3RighthopPlantX3LefthopPlantX2Left(){
  hopPlantX3();
  turn(RIGHT);
  hopPlantX3();
  turn(LEFT);
  hopPlantX2();
  turn(LEFT);
}

public void hopPlantX3LefthopPlantX2LefthopPlantX3Right(){
  hopPlantX3();
  turn(LEFT);
  hopPlantX2();
  turn(LEFT);
  hopPlantX3();
  turn(RIGHT);
}

public void plantCross(){
  hopX6();
  turn(RIGHT);
  hopX3();
  hopPlantX3RighthopPlantX3LefthopPlantX2Left();
  hopPlantX3RighthopPlantX3LefthopPlantX2Left();
  hopPlantX3();
  turn(RIGHT);
  hopPlantX3LefthopPlantX2LefthopPlantX3Right();
  hopPlantX3();
  turn(LEFT);
  hopPlantX2();
  hop();


  
}
    
    
    
    // Do NOT touch the code below here

    public Jeroo() {super();}

    public Jeroo(int flowers) {super(flowers); }

    public Jeroo(int x, int y) { super(x, y); }

    public Jeroo(int x, int y, CompassDirection direction) { super (x, y, direction);}

    public Jeroo(int x, int y, int flowers) { super (x, y, flowers);}

    public Jeroo(int x, int y, CompassDirection direction, int flowers) { super(x, y, direction, flowers);}

}
