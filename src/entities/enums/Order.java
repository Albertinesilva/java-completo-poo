package entities.enums;

import java.util.Date;

public class Order {
  
  private Integer id;
  private Date moment;
  private OrderStatus status;

  public Order() {
  }

  public Order(Integer id, Date moment, OrderStatus status) {
    this.id = id;
    this.moment = moment;
    this.status = status;
  }

  public Integer getId() {
    return this.id;
  }

  public Date getMoment() {
    return this.moment;
  }

  public OrderStatus getStatus() {
    return this.status;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public void setMoment(Date moment) {
    this.moment = moment;
  }

  public void setStatus(OrderStatus status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "\nid = " + getId() +
        "\nmoment = " + getMoment() +
        "\nstatus = " + getStatus() + "\n";
  }
}
