import java.awt.*;

public class Triangle extends Shape {
  // Instance variables
  private int leng;


  // Constructor
  public Triangle(int x, int y, Color color,
                   int leng) {
    super(x, y, color);
   this.leng=leng;
  }
  // Instance methods
  public void draw(Graphics g) {
 g.setColor(getColor());
int[] Xcoord = { getX(), getX() + leng, getX() + leng / 2};
int[] Ycoord = { getY(), getY(), getY()*(1+ 2 / (2))};
g.fillPolygon(Xcoord,Ycoord,3);
 
  }

  public int getHeight() {
    return leng;
  }

  public int getWidth() {
    return leng;
  }
}


