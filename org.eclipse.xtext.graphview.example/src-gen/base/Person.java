package base;

import base.Address;
import base.Phone;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

public class Person {
  public Person() {
  }
  
  public Person(final Procedure1<Person> initializer) {
    initializer.apply(this);
  }
  
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
  
  public String fullName(final String it, final int it_1) {
    String _plus = (this.firstName + " ");
    String _plus_1 = (_plus + this.lastName);
    return _plus_1;
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
  
  public String toString() {
    StringBuilder result = new StringBuilder("\nPerson {");
    result.append("\n  firstName = ").append(String.valueOf(firstName).replace("\n","\n  "));
    result.append("\n  lastName = ").append(String.valueOf(lastName).replace("\n","\n  "));
    result.append("\n  address = ").append(String.valueOf(address).replace("\n","\n  "));
    result.append("\n  phone = ").append(String.valueOf(phone).replace("\n","\n  "));
    result.append("\n}");
    return result.toString();
    
  }
}
