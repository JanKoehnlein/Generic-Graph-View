package base;

import base.Address;
import base.Phone;
import java.util.List;
import org.eclipse.xtext.xbase.lib.StringExtensions;

public class Person {
  private String firstName;
  
  public String getFirstName() {
    return this.firstName;
  }
  
  public void setFirstName(final String firstName) {
    this.firstName = firstName;
  }
  
  private String lastName;
  
  public String getLastName() {
    return this.lastName;
  }
  
  public void setLastName(final String lastName) {
    this.lastName = lastName;
  }
  
  public String fullName() {
    String _operator_plus = StringExtensions.operator_plus(this.firstName, " ");
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, this.lastName);
    return _operator_plus_1;
  }
  
  private List<Address> address;
  
  public List<Address> getAddress() {
    return this.address;
  }
  
  public void setAddress(final List<Address> address) {
    this.address = address;
  }
  
  private Phone phone;
  
  public Phone getPhone() {
    return this.phone;
  }
  
  public void setPhone(final Phone phone) {
    this.phone = phone;
  }
}
