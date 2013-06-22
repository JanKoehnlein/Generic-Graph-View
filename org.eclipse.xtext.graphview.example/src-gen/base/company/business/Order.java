package base.company.business;

import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;

@SuppressWarnings("all")
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
  
  @Override
  public String toString() {
    String result = new ToStringHelper().toString(this);
    return result;
  }
}
