// Represents a circle that can be displayed in a graphics
// context

import java.awt.*;

public class Circle extends Shape {
  // Instance variables
  private int diameter;

  // Constructor
  public Circle(int x, int y, Color color, int diameter) {
    super(x, y, color);
    this.diameter = diameter;
  }
  // Instance methods
  public void draw(Graphics g) {
    g.setColor(getColor());
    g.fillOval(getX(), getY(), diameter, diameter);
  }

  public int getHeight() {
    return diameter;
  }

  public int getWidth() {
    return diameter;
  }
}
