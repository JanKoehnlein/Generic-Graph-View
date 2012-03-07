package base.company.business;

import base.Person;
import base.company.business.Order;
import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

public class Customer extends Person {
  public Customer() {
  }
  
  public Customer(final Procedure1<Customer> initializer) {
    initializer.apply(this);
  }
  
  private List<Order> orders;
  
  public List<Order> getOrders() {
    return this.orders;
  }
  
  public void setOrders(final List<Order> orders) {
    this.orders = orders;
  }
  
  public boolean placeOrder(final Order order) {
    boolean _xblockexpression = false;
    {
      boolean _equals = Objects.equal(this.orders, null);
      if (_equals) {
        ArrayList<Order> _newArrayList = CollectionLiterals.<Order>newArrayList();
        this.orders = _newArrayList;
      }
      boolean _add = this.orders.add(order);
      _xblockexpression = (_add);
    }
    return _xblockexpression;
  }
  
  public String toString() {
    StringBuilder result = new StringBuilder("\nCustomer {");
    result.append("\n  orders = ").append(String.valueOf(orders).replace("\n","\n  "));
    result.append("\n  firstName = ").append(String.valueOf(firstName).replace("\n","\n  "));
    result.append("\n  lastName = ").append(String.valueOf(lastName).replace("\n","\n  "));
    result.append("\n  address = ").append(String.valueOf(address).replace("\n","\n  "));
    result.append("\n  phone = ").append(String.valueOf(phone).replace("\n","\n  "));
    result.append("\n}");
    return result.toString();
    
  }
}
