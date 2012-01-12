package company;

import company.Address;
import company.Boss;
import company.Employee;
import company.Phone;
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
  
  public String fullName(final String x) {
    String _operator_plus = StringExtensions.operator_plus(this.firstName, " ");
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, this.lastName);
    return _operator_plus_1;
  }
  
  private Address address;
  
  public Address getAddress() {
    return this.address;
  }
  
  public void setAddress(final Address address) {
    this.address = address;
  }
  
  private Phone phone;
  
  public Phone getPhone() {
    return this.phone;
  }
  
  public void setPhone(final Phone phone) {
    this.phone = phone;
  }
  
  private Boss boss;
  
  public Boss getBoss() {
    return this.boss;
  }
  
  public void setBoss(final Boss boss) {
    this.boss = boss;
  }
  
  private Employee friend;
  
  public Employee getFriend() {
    return this.friend;
  }
  
  public void setFriend(final Employee friend) {
    this.friend = friend;
  }
}
