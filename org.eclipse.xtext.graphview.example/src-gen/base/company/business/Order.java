package base.company.business;

import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

public class Order {
  public Order() {
  }
  
  public Order(final Procedure1<Order> initializer) {
    initializer.apply(this);
  }
  
  private long orderID;
  
  public long getOrderID() {
    return this.orderID;
  }
  
  public void setOrderID(final long orderID) {
    this.orderID = orderID;
  }
  
  public String toString() {
    StringBuilder result = new StringBuilder("\nOrder {");
    result.append("\n  orderID = ").append(String.valueOf(orderID).replace("\n","\n  "));
    result.append("\n}");
    return result.toString();
    
  }
}
