package base.business;

import base.Person;
import base.business.Order;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;

public class Customer extends Person {
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
      boolean _operator_equals = ObjectExtensions.operator_equals(this.orders, null);
      if (_operator_equals) {
        ArrayList<Order> _newArrayList = CollectionLiterals.<Order>newArrayList();
        this.orders = _newArrayList;
      }
      boolean _operator_add = CollectionExtensions.<Order>operator_add(this.orders, order);
      _xblockexpression = (_operator_add);
    }
    return _xblockexpression;
  }
}
