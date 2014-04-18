package base;

import base.Address;
import base.Phone;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;

@SuppressWarnings("all")
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
    return ((this.firstName + " ") + this.lastName);
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
  
  @Override
  public String toString() {
    String result = new ToStringHelper().toString(this);
    return result;
  }
}
