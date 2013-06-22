package base;

import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;

@SuppressWarnings("all")
public class Phone {
  public Phone() {
  }
  
  public Phone(final Procedure1<Phone> initializer) {
    initializer.apply(this);
  }
  
  private String number;
  
  public String getNumber() {
    return this.number;
  }
  
  public void setNumber(final String number) {
    this.number = number;
  }
  
  @Override
  public String toString() {
    String result = new ToStringHelper().toString(this);
    return result;
  }
}
