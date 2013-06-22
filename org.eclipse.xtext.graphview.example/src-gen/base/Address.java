package base;

import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;

@SuppressWarnings("all")
public class Address {
  public Address() {
  }
  
  public Address(final Procedure1<Address> initializer) {
    initializer.apply(this);
  }
  
  private String street;
  
  public String getStreet() {
    return this.street;
  }
  
  public void setStreet(final String street) {
    this.street = street;
  }
  
  private String city;
  
  public String getCity() {
    return this.city;
  }
  
  public void setCity(final String city) {
    this.city = city;
  }
  
  private String country;
  
  public String getCountry() {
    return this.country;
  }
  
  public void setCountry(final String country) {
    this.country = country;
  }
  
  @Override
  public String toString() {
    String result = new ToStringHelper().toString(this);
    return result;
  }
}
