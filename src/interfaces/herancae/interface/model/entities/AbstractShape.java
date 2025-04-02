package interfaces.heranca_e_interface.model.entities;

import interfaces.heranca_e_interface.model.enums.Color;

public abstract class AbstractShape implements Shape {

  private Color color;

  public AbstractShape(Color color) {
    this.color = color;
  }

  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

}
